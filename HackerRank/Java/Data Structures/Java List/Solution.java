import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int items = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            while (items-- > 0) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            int commands = Integer.parseInt(br.readLine());
            while (commands-- > 0) {
                String command = br.readLine();
                if (command.equalsIgnoreCase("insert")) {
                    st = new StringTokenizer(br.readLine());
                    list.add(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
                } else if (command.equalsIgnoreCase("delete")) {
                    list.remove(Integer.parseInt(br.readLine()));
                }
            }
            list.stream().forEach(o -> System.out.print(o + " "));
        }
    }
}