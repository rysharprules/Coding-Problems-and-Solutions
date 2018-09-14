import java.math.BigDecimal;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        s = Arrays.asList(s)
                .stream()
                .filter(Objects::nonNull)
                .sorted(Collections.reverseOrder(Comparator.comparing(BigDecimal::new)))
                .toArray(String[]::new);

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}