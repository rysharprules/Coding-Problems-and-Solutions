import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

        public static void main(String[] args) {
            try (Scanner s = new Scanner(System.in)) {
                int size = s.nextInt();
                String[] left = new String[size];
                String[] right = new String[size];

                for (int i = 0; i < size; i++) {
                    left[i] = s.next();
                    right[i] = s.next();
                }

                Set<String> set = new HashSet<>();

                for (int i = 0; i < size; i++) {
                    set.add(left[i] + " " + right[i]);
                    System.out.println(set.size());
                }
            }
        }
}