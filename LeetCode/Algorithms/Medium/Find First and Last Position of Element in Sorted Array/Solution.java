import java.util.Arrays;

// TAG: binarySearch
class Solution {

    public static void main(String... args) {
        Solution solution = new Solution();

        // failed on a couple of test cases hence the numerosity of tests here
        Arrays.stream(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)).forEach(System.out::print); // Output: 34
        System.out.println();
        Arrays.stream(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)).forEach(System.out::print); // -1-1
        System.out.println();
        Arrays.stream(solution.searchRange(new int[]{1}, 1)).forEach(System.out::print); // 00
        System.out.println();
        Arrays.stream(solution.searchRange(new int[]{1}, 0)).forEach(System.out::print); // -1-1
        System.out.println();
        Arrays.stream(solution.searchRange(new int[]{2, 2}, 2)).forEach(System.out::print); // 01
        System.out.println();
        Arrays.stream(solution.searchRange(new int[]{2, 2}, 1)).forEach(System.out::print); // -1-1
        System.out.println();
        Arrays.stream(solution.searchRange(new int[]{1, 2, 2}, 2)).forEach(System.out::print); // 12
        System.out.println();
        Arrays.stream(solution.searchRange(new int[]{1, 2, 2, 2}, 2)).forEach(System.out::print); // 13
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int leftIndex = findLeftIndex(nums, target);

        // assert that leftIndex is within the array bounds and that target is actually in nums
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return result;
        }

        result[0] = leftIndex;
        result[1] = findRightIndex(nums, target) - 1; // subtract 1 to get rightmost index

        return result;
    }

    private int findLeftIndex(int[] nums, int target) {
        return findIndex(nums, target, true);
    }

    private int findRightIndex(int[] nums, int target) {
        return findIndex(nums, target, false);
    }

    // returns leftmost or rightmost index at which target appears in be in sorted array nums via binary search
    private int findIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

}