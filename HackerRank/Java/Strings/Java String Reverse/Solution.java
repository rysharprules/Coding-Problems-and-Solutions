import java.util.*;

public class Solution {

    // Submitted answer - felt like cheating using StringBuilder's reverse method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A).reverse();
        System.out.print(A.equals(sb.toString()) ? "Yes" : "No");
    }

    // Alternate methods

    // recursion
    static String reverseRecursive(String s) {
        if (s.length() == 0)
            return "";
        return s.charAt(s.length() - 1) + reverseRecursive(s.substring(0, s.length() - 1));
    }

    // for loop
    static String reverseWithoutReverseMethod(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; --i)
            sb.append(s.charAt(i));
        return sb.toString();
    }

    // same as for loop but just print
    static void reversePrint(String str) {
        for (int i = str.length() - 1; i >= 0; i--)
            System.out.print(str.charAt(i));
    }
}