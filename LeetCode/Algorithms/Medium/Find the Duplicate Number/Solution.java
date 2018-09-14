public class Solution {

    public static void main(String... args) {
        Solution solution = new Solution();
        /*
        Example 1:
        Input: [1,3,4,2,2]
        Output: 2

        Example 2:
        Input: [3,1,3,4,2]
        Output: 3
         */
        System.out.println(solution.findDuplicate(new int[]{1, 3, 4, 2, 2})); // 2
        System.out.println(solution.findDuplicate(new int[]{3, 1, 3, 4, 2})); // 3
    }

    /*
        Use two pointers the fast and the slow. The fast one goes forward two steps each time, while the slow one goes
        only step each time. They must meet the same item when slow==fast. In fact, they meet in a circle, the duplicate
        number must be the entry point of the circle when visiting the array from nums[0]. Next we just need to find the
        entry point. We use a point(we can use the fast one before) to visit form begining with one step each time, do the
        same job to slow. When fast==slow, they meet at the entry point of the circle.
     */
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        // fast works same as slow but moves twice fast
        int fast = nums[nums[0]];

        while (fast != slow) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;
        while (fast != slow) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}

