import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    public static void main(String ...args){
        /*
        n = 15,

        Return:
        [
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz"
        ]
        */
        Solution solution = new Solution();
        solution.fizzBuzz(15).stream().forEach(System.out::println);
        System.out.println();
        solution.fizzBuzzStream(15).stream().forEach(System.out::println);
    }

    public List<String> fizzBuzzStream(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(
                i -> i % 3 == 0 ?
                        (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                        (i % 5 == 0 ? "Buzz" : String.valueOf(i)))
                .collect(Collectors.toList());
    }

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % (5 * 3) == 0) result.add("FizzBuzz");
            else if(i % 5 == 0) result.add("Buzz");
            else if(i % 3 == 0) result.add("Fizz");
            else result.add(String.valueOf(i));
        }
        return result;
    }
}