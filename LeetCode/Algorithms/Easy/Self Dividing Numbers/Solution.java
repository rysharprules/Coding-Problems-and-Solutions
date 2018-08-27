import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String... args) {
        Solution solution = new Solution();
        System.out.println(solution.selfDividingNumbers(1, 22));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isValid(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isValid(int num) {
        int current = num;
        while (current != 0) {
            int digit = current % 10; // modulus of 10 gets us the remaining digit, e.g. 8432, digit is 2
            if (digit == 0 || num % digit != 0) { // if ends in zero is not self divisible return false
                return false;
            }
            current /= 10; // divide by 10 until at 0 (int conversion removes decimal point)
        }
        return true;
    }
}
