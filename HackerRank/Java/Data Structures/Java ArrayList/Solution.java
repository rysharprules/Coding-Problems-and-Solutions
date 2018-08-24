import java.util.*;

public class Solution {

    public static void main(String ...args) {
        try (Scanner scan = new Scanner(System.in)) {
            int noLists = scan.nextInt();
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < noLists; i++) {
                int noValues = scan.nextInt();
                List<Integer> list = new ArrayList<>();
                map.put(i, list);
                for (int j = 0; j < noValues; j++) {
                    list.add(scan.nextInt());
                }
            }
            int noQueries = scan.nextInt();
            for (int i = 0; i < noQueries; i++) {
                try {
                    int value = map.get(scan.nextInt() - 1).get(scan.nextInt() - 1);
                    System.out.println(value);
                } catch (Exception ex) {
                    System.out.println("ERROR!");
                }
            }
        }
    }
}