import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int count = 1;
            while (scan.hasNext()) {
                System.out.printf("%d %s%n", count++, scan.nextLine());
            }
        }
    }
}