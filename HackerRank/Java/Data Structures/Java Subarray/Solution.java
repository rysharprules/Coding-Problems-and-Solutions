import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String ...args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int size = Integer.parseInt(br.readLine());
            int[] array = new int[size];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(getNegativeSubarraysCount(array));
    }

    private static int getNegativeSubarraysCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}