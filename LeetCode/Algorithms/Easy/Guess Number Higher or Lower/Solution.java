/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num);
*/
import java.time.Instant;

// TAG: binarySearch
public class Solution extends GuessGame {

    public static void main(String ...args) {
        Solution solution = new Solution();

        // time in millis is always 0 on local machine.
        long start = Instant.now().toEpochMilli();
        System.out.println(solution.guessNumber(10));
        System.out.println("guessNumber=" + (Instant.now().toEpochMilli() - start));

        long start2 = Instant.now().toEpochMilli();
        System.out.println(solution.guessNumber_TooSlow(10));
        System.out.println("guessNumber_TooSlow=" + (Instant.now().toEpochMilli() - start2));
    }

    // this solution works but failed on submission due to "Time Limit Exceeded"
    public int guessNumber_TooSlow(int n) {
        int start = 1;
        while (start <= n) {
            int mid = (start + n) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                n = mid - 1;
            } else {//if (guess(mid) == 1) {
                start = mid + 1;
            }
        }
        return 0;
    }

    // this solution provided by another was "Accepted" although depending on myNumber and n, can lead to an additional iteration...
    // otherwise, both solutions look to be almost identical so *shrug*
    public int guessNumber(int n) {
        int low = 0;
        int high = n;
        int mid = high / 2;
        while (low < high) {
            if (1 == guess(mid)) low = mid + 1;
            else if (-1 == guess(mid)) high = mid;
            else {
                return mid;
            }
            mid = low + (high - low) / 2;
        }
        return mid;
    }
}

class GuessGame {

    private int myNumber = 6;

    public int guess(int number) {
        if(number == myNumber) return 0;
        if(number > myNumber) return -1;
        return 1;
    }
}