import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayDeque;

class Solution {

    public static void main(String[] args) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        try(Scanner scan = new Scanner(System.in)) {
            while (scan.hasNext()) {
                String expression = scan.next();
                System.out.println(isBalanced(expression, map) ? "true" : "false");
            }
        }
    }

    private static boolean isBalanced(String expression, Map<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false;
        }
        Deque<Character> deque = new ArrayDeque<>(); // use deque as a stack
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}