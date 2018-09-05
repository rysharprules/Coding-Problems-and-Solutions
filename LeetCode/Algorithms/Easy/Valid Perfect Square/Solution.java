// TAG: binarySearch
// TAG: sqrt

/*
    The first 20 square numbers are:
    1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361 and 400
 */
class Solution {

    public static void main(String ...args) {
        Solution solution = new Solution();

        System.out.println(solution.isPerfectSquare(25));
        System.out.println(solution.isPerfectSquare(14));

        System.out.println(solution.isPerfectSquareBinarySearch1(16));
        System.out.println(solution.isPerfectSquareBinarySearch1(14));

        System.out.println(solution.isPerfectSquareBinarySearch2(16));
        System.out.println(solution.isPerfectSquareBinarySearch2(14));
    }

    /*
        1 = 1
        4 = 1 + 3
        9 = 1 + 3 + 5
        16 = 1 + 3 + 5 + 7
        25 = 1 + 3 + 5 + 7 + 9
        36 = 1 + 3 + 5 + 7 + 9 + 11
        ....
        so 1+3+...+(2n-1) = (2n-1 + 1)n/2 = nn
     */
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

    public boolean isPerfectSquareBinarySearch1(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }

    public boolean isPerfectSquareBinarySearch2(int num) {
        if (num <= 0) return false;
        int low = 1, high = num;
        while (low < high) {
            int mid = low + (high - low) / 2 + 1;
            if (num / mid >= mid) low = mid;
            else high = mid - 1;
        }
        return low * low == num;
    }

}