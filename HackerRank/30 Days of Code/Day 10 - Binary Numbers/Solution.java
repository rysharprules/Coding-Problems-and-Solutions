import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// TAG: bitwise
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        //System.out.println(consecutiveOnesAlt1(n));
        //System.out.println(consecutiveOnesAlt2(n));
        System.out.println(consecutiveOnesBinaryString(n));
        scanner.close();
    }

    public static int consecutiveOnesBinaryString(int n) {
        int consecOnes = 0;
        String binary = Integer.toString(n, 2); // n as base 2
        // split on zero to get an array of Strings of "1"s.
        String[] parts = binary.split("0");

        // now find the largest String in the array and return it's length

        // as enhanced for loop
        //for(String part : parts){
        //    if (consecOnes < part.length()) consecOnes = part.length();
        //}
        //return consecOnes;

        // as a Stream
        return Arrays.stream(parts)
                .max(Comparator.comparingInt(String::length))
                .get()
                .length();
    }

    public static int consecutiveOnesAlt1(int n) {
        int counter = 0, max = 0;
        while (n > 0) {
            // alternative to using an if, multiply the counter by the result of n%2.
            counter = ++counter * (n % 2);
            // rather than check which is larger with an if, use Math.max
            max = Math.max(counter, max);
            n /= 2;
        }
        return max;
    }

    public static int consecutiveOnesAl2(int n) {
        int counter = 0, max = 0;
        while (n > 0) {
            if ((n & 1) == 1) {// & operator is more efficient than modulus for finding odds
                counter++;
                max = Math.max(max, counter);
            } else {
                counter = 0;
            }
            n = n >> 1; // right shift operator more efficient way of dividing by 2
        }
        return max;
    }

}