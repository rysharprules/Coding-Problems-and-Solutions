import java.util.Scanner;

public class Solution {

    public static void main(String ...args) {
        try(Scanner scan = new Scanner(System.in)) {
            int T = scan.nextInt();
            while (T-- > 0) {
                int size = scan.nextInt();
                int leap = scan.nextInt();
                int[] array = new int[size];
                for (int i = 0; i < size; i++) {
                    array[i] = scan.nextInt();
                }
                System.out.println(isTraversable(array, leap, 0) ? "YES" : "NO");
            }
        }
    }

    private static boolean isTraversable(int[] array, int leap, int position) {

        if (position < 0 || array[position] == 1) { // invalid position
            return false;
        } else if (position + 1 >= array.length || position + leap >= array.length) { // reached end of array via step or leap
            return true;
        }

        array[position] = 1; // alter the array, mark as visited to avoid back and forth

        return isTraversable(array, leap, position + leap) || // leap
                isTraversable(array, leap, position + 1) || // step forward
                isTraversable(array, leap, position - 1); // step backward
    }
}