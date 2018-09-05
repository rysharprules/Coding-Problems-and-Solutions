import java.io.*;
import java.util.*;
import java.time.LocalDate;

public class Solution {

    public static void main(String... args) {
        try (Scanner scan = new Scanner(System.in)) {
            LocalDate actualDate = buildDate(scan);
            LocalDate expectedDate = buildDate(scan);
            int fine;

            if (actualDate.isEqual(expectedDate) || actualDate.isBefore(expectedDate)) {
                fine = 0;
            } else if (actualDate.getMonth() == expectedDate.getMonth()
                    && actualDate.getYear() == expectedDate.getYear()) {
                fine = 15 * (actualDate.getDayOfMonth() - expectedDate.getDayOfMonth());
            } else if (actualDate.getYear() == expectedDate.getYear()) {
                fine = 500 * (actualDate.getMonthValue() - expectedDate.getMonthValue());
            } else {
                fine = 10_000;
            }

            System.out.print(fine);
        }
    }

    private static LocalDate buildDate(Scanner scan) {
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        return LocalDate.of(year, month, day);
    }

}