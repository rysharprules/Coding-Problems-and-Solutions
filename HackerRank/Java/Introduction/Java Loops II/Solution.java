import java.util.*;

class Solution {
    public static void main(String[] argh) {
        try(Scanner in = new Scanner(System.in)) {
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                for (int j = 1; j <= n; j++) {
                    int r = a;
                    for (int k = 1, l = 1; k <= j; k++, l = l << 1) {
                        r += b * l;
                    }
                    System.out.print(r + " ");
                }
                System.out.println("");
            }
        }
    }
}