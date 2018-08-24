import java.util.Scanner;

class Solution {
    private static boolean flag;
    private static int B, H;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        flag = B > 0 && H > 0;
        scan.close();
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}