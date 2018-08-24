import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String number = scanner.nextLine();

        if (number.length() > 100) {
            System.out.println("not prime");
        } else {
            BigInteger b = new BigInteger(number);

            if (b.isProbablePrime(1)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        scanner.close();
    }
}
