import java.util.Scanner;

// TAG: bitwise
public class Solution {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int loops = scan.nextInt();
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            while (loops-- > 0) {
                int n = scan.nextInt(), k = scan.nextInt();

                if (((k - 1) | k) > n && (k & 1) == 0) {
                    System.out.println(k - 2);
                } else {
                    System.out.println(k - 1);
                }
            }
        }
    }
}