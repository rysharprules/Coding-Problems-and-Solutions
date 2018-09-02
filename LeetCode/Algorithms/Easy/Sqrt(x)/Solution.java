// TAG: binarySearch
class Solution {

    // use the Java API's Math utils
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    // use binary search
    public int mySqrtWithBinarySearch(int x) {
        if (x == 0) return 0;

        int left = 1, right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) return mid;
            else if (mid > (x / mid)) {
                right = mid - 1;
            } else {
                if ((mid + 1) > x / (mid + 1)) return mid;
                left = mid + 1;
            }
        }

        return left;
    }
}