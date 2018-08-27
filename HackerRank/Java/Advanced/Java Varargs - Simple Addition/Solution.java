class Add {

    public String add(int... numbers) {
        if (numbers == null || numbers.length == 0) return "";
        if (numbers.length == 1) return String.valueOf(numbers[0]);

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            sb.append(numbers[i]);
            if (i != numbers.length - 1) sb.append("+");
        }
        sb.append("=").append(sum);
        return sb.toString();
    }

    // modified for HackerRank submission
    /*
        public void add(int... numbers) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            sb.append(numbers[i]);
            if (i != numbers.length - 1) sb.append("+");
        }
        sb.append("=").append(sum);
        System.out.println(sb.toString());
    }
     */

}

public class Solution {

    public static void main(String[] args) {
        Add adder = new Add();
        System.out.println(adder.add(1, 2));
        System.out.println(adder.add(1, 2, 3));
        System.out.println(adder.add(1, 2, 3, 4, 5));
        System.out.println(adder.add(1, 2, 3, 4, 5, 6));
    }
}

