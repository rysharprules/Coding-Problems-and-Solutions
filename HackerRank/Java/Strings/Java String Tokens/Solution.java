import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextLine()) {
            System.out.println("0");
            return;
        }

        String s = scan.nextLine();

        if (s == null || s.equals("") || s.trim().equals("")) {
            System.out.println("0");
            return;
        } else if (s.length() > 400000) {
            return;
        }

        String[] items = s.trim().split("[ !,?.\\_'@]+");

        System.out.println(items.length);


        for (String item : items) {
            System.out.println(item);
        }
        scan.close();
    }
}