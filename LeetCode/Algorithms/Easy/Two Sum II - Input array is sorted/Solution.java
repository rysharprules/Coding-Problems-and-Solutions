import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        /*
        Input: numbers = [2,7,11,15], target = 9
        Output: [1,2]
        Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
         */
        Arrays.stream(solution.twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::print); // 12
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers == null || numbers.length < 2) return result;
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{++left, ++right};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }

    // Slight edit of Problem #1 TwoSum. Would work but fails due to time limit.
    public int[] twoSumEdited(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{++i, ++j};// added prepend to get correct index
                }
            }
        }
        return new int[0];
    }
}