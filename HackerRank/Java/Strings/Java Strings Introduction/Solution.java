import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        String msg = "No";
        if (A.compareTo(B) > 0) {
            msg = "Yes";
        }
        System.out.println(msg);
        A = A.substring(0, 1).toUpperCase().concat(A.substring(1));
        B = B.substring(0, 1).toUpperCase().concat(B.substring(1));
        System.out.println(A + " " + B);

        // an alternate method is to use ASCII to capitalise the first char... e.g.
        char c = (char) (A.charAt(0) + 'a'); // 'a' is 32
        A = A.replace(A.charAt(0), c);
        // this assumes original char is a to z
    }

}