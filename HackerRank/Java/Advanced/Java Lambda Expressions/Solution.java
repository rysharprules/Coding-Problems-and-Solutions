class Solution {
    public static PerformOperation isOdd() {
        return n -> (n & 1) == 1;
    }

    public static PerformOperation isPrime() {
        return n -> {
            if (n < 2) {
                return false;
            }
            int sqrt = (int) Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return n -> {
            String original = Integer.toString(n);
            String reversed = new StringBuilder(original.reverse().toString();
            return original.equals(reversed);
        };
    }
}