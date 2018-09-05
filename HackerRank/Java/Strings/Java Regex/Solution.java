import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

// TAG: regex
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    public static String pattern =
            "^([01]?\\d{1,2}|2[0-4]\\d|25[0-5])" +
                    "\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])" +
                    "\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])" +
                    "\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])$";
}