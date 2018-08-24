import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if ((N & 1) != 0 || (N > 5 && N < 21)) {
            System.out.print("Weird");
        } else {
            System.out.print("Not Weird");
        }
        scanner.close();
    }
}