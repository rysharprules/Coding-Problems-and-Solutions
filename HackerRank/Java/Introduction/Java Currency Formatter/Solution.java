import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        double payment = 0;
        try(Scanner scanner = new Scanner(System.in)) {
            payment = scanner.nextDouble();
        }

        System.out.println("US: " + getPaymentForLocale(Locale.US, payment));
        System.out.println("India: " + getPaymentForLocale(new Locale("en", "IN"), payment));
        System.out.println("China: " + getPaymentForLocale(Locale.CHINA, payment));
        System.out.println("France: " + getPaymentForLocale(Locale.FRANCE, payment));
    }

    private static String getPaymentForLocale(Locale locale, double payment) {
        return NumberFormat.getCurrencyInstance(locale).format(payment);
    }
}