class MyCalculator {

    public long power(int num1, int num2) throws Exception {
        if (num1 == 0 && num2 == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (num1 < 0 || num2 < 0) {
            throw new Exception("n or p should not be negative.");
        }
        return (long) Math.pow(num1, num2);
    }
    /**
     * I can't think of a good argument for throwing Exception like this. Whenever possible a more specific Exception should
     * be thrown or handled.
     */
}