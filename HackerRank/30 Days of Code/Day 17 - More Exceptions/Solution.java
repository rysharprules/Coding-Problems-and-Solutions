class Calculator {

    public int power(int base, int n) throws Exception {
        if (base < 0 || n < 0) {
            throw new Exception("n and p should be non-negative");
        } else if (n == 0) {
            return 1;
        }
        return base * power(base, n - 1);
    }
}

class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
