import java.util.*;

public class Solution {

    static void plusMinus(int[] arr) {
        int size = arr.length;
        int zero = 0, pos = 0, neg = 0;
        for (int num : arr) {
            if (num == 0) zero++;
            if (num > 0) pos++;
            if (num < 0) neg++;
        }
        double zerod = (double) zero / size;
        double negd = (double) neg / size;
        double posd = (double) pos / size;
        System.out.printf("%f%n%f%n%f", posd, negd, zerod);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
