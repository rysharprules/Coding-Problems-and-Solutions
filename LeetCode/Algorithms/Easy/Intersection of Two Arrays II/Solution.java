import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        Arrays.stream(solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})).forEach(System.out::print); // 22
        System.out.println();
        Arrays.stream(solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})).forEach(System.out::print); // 49
        System.out.println();
        Arrays.stream(solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2})).forEach(System.out::print); // 2
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap();
        List<Integer> list = new ArrayList();

        // create map of numbers and count of those numbers (with number as key)
        for (int number : nums1) map.put(number, map.getOrDefault(number, 0) + 1);

        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                map.put(num, map.get(num) - 1);
                map.remove(num, 0); // remove the entry for the key only if it's mapped to the specified value (0)
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}