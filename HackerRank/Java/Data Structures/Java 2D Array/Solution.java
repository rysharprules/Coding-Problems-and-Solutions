import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.print(getLargestHourglass(arr));
        scanner.close();
    }

    private static int getLargestHourglass(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sumOfHourglass = array[row + 0][col + 0] + array[row + 0][col + 1] + array[row + 0][col + 2]
                                                             + array[row + 1][col + 1] +
                                     array[row + 2][col + 0] + array[row + 2][col + 1] + array[row + 2][col + 2];
                max = Math.max(max, sumOfHourglass);
            }
        }
        return max;
    }

}
