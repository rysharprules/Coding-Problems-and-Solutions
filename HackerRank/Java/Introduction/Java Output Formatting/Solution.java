import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                String s1 = sc.next();
                int x = sc.nextInt();
                System.out.printf("%-15.10s%03d%n", s1, (x >= 0 && x < 1000) ? x : 0);
            }
            System.out.println("================================");
        }
    }
}