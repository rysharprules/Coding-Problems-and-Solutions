import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

// TAG: regex
public class Solution {

    private static final Pattern PATTERN = Pattern.compile("^.+@gmail\\.com$");

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int loops = scan.nextInt();
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            List<String> validNames = new ArrayList<>();

            while (loops-- > 0) {
                String[] firstNameEmail = scan.nextLine().split(" ");
                if (PATTERN.matcher(firstNameEmail[1]).matches()) validNames.add(firstNameEmail[0]);
            }
            validNames.stream().sorted().forEach(System.out::println);
        }
    }
}