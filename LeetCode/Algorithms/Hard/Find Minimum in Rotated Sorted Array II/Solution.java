// TAG: binarySearch
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.findMin(new int[]{1, 3, 5})); // 1
        System.out.println(solution.findMin(new int[]{2, 2, 2, 0, 1})); // 0
        System.out.println(solution.findMin(new int[]{1, 2, 2, 2, 3, 3, 4, 5, 0, 0, 1, 1})); // 0
        System.out.println(solution.findMin(new int[]{3, 3, 1, 3})); // 1
    }

    public int findMin(int[] nums) {
        int mid, lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            mid = lo + (hi - lo) / 2;

            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else if (nums[mid] < nums[hi]) {
                hi = mid;
            } else { // nums[mid] == nums[hi]
                hi--;
            }
        }
        return nums[lo];
    }
}