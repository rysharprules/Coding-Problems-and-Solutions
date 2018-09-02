import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            int loops = scan.nextInt();
            scan.nextLine();
            for(int i = 0; i < loops; i++) {
                splitAndPrintOddsAndEvens(scan.nextLine());
            }
        }
    }

    private static void splitAndPrintOddsAndEvens(String word) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            if((i & 1) == 0) {
                even.append(word.charAt(i));
            } else {
                odd.append(word.charAt(i));
            }
        }
        System.out.printf("%s %s%n", even, odd);
    }
}