// TAG: binarySearch
class Solution {

    public static void main(String ...args) {
        Solution solution = new Solution();

        int[] nums = {4,5,6,7,0,1,2};
        int[] nums2 = {4,5,6,7,0,1,2};

        System.out.println(solution.search(nums, 0));
        System.out.println(solution.search(nums2, 3));

        System.out.println(solution.search2(nums, 0));
        System.out.println(solution.search2(nums2, 3));
    }

    public int search2(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
//            long num;
//            if((nums[mid] < nums[0]) == (target < nums[0])) {
//                num = nums[mid];
//            } else {
//                if(target < nums[0]) {
//                    num = Long.MIN_VALUE;
//                } else {
//                    num = Long.MAX_VALUE;
//                }
//            }
            long num = (nums[mid] < nums[0]) == (target < nums[0]) ? nums[mid]
                    : target < nums[0] ? Long.MIN_VALUE : Long.MAX_VALUE;
            if (num > target) {
                hi = mid - 1;
            } else if (num < target) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int search(int[] A, int target) {
        int lo = 0;
        int hi = A.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (A[mid] == target) return mid;

            if (A[lo] <= A[mid]) {
                if (target >= A[lo] && target < A[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (target > A[mid] && target <= A[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return A[lo] == target ? lo : -1;
    }
}