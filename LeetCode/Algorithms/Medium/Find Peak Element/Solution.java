// TAG: binarySearch
class Solution {

    public int findPeakElement(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return 0;
        }

        int left = 0, right = length - 1;
        while (right - left > 1) { // right is greater than left
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) { // is the number to right greater?
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        // post-processing
        return (left == length - 1 || nums[left] > nums[left + 1]) ? left : right;
    }
}