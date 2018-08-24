import java.util.*;

class Solution{
    public static void main(String []argh) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(in.nextLine(), in.nextInt());
                in.nextLine();
            }
            while (in.hasNext()) {
                String person = in.nextLine();
                if (map.get(person) == null) {
                    System.out.println("Not found");
                } else {
                    System.out.println(person + "=" + map.get(person));
                }
            }
        }
    }
}