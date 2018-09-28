import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        Arrays.stream(solution.intersection(new int[]{1,2,2,1}, new int[]{2,2})).forEach(System.out::print); // 2
        System.out.println();
        Arrays.stream(solution.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})).forEach(System.out::print); // 94
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums1).distinct().filter(set::contains).toArray();
    }
}