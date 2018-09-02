// TAG: powerOf
class Solution {

    private static final String PRINT_OUT_TEXT = "Expected: %f Actual: %f%n";

    public static void main(String... args) {
        Solution solution = new Solution();

        // use Math API as validation
        System.out.printf(PRINT_OUT_TEXT, Math.pow(2.00000, 10), solution.myPow(2.00000, 10));
        System.out.printf(PRINT_OUT_TEXT, Math.pow(2.10000, 3), solution.myPow(2.10000, 3));
        System.out.printf(PRINT_OUT_TEXT, Math.pow(2.00000, -2), solution.myPow(2.00000, -2));
        System.out.printf(PRINT_OUT_TEXT, Math.pow(5, 0), solution.myPow(5, 0));
        System.out.printf(PRINT_OUT_TEXT, Math.pow(2.00000, -2147483648), solution.myPow(2.00000, -2147483648));
    }

    /*
        Initial solution -- kept for lessons learnt. failed on two counts:
        1. Too slow, use of for loops here (although correct) are the cause - new approach required
        2. Fails the integer overflow test with -2147483648. Maths.abs does not adjust the number and returns 1.0 incorrectly.
            If we had used -n here instead of Maths.abs we would had hit a RuntimeException
     */
    public double myPowInitial(double x, int n) {
        if (n == 0) return 1;
        boolean positive = n > 0;
        double result = 1;

        if (positive) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        } else {
            for (int i = 0; i < Math.abs(n); i++) { // Math.abs to make neg number positive
                result /= x; // for negative numbers powerOf has divide effect
            }
        }
        return result;
    }

    /*
        Accepted solution
        Recursion rather than iteration
        Alternative method used for Integer overflow case
     */
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            return 1 / x * myPow(1 / x, -(n + 1));
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }

    /*
        Better solution - this is a slightly faster solution
     */
    public double myPowBetter(double x, int n) {
        if (n == 0) return 1;
        double half = myPowBetter(x, n / 2);
        if (n < 0) {
            x = 1.0 / x;
        }
        return (n & 1) == 0 ? half * half : half * half * x;
    }
}