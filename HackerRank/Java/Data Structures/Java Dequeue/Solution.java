import java.util.*;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>(); // ensures order

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int max = 0;
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {

                if (i >= m) {// remove old value
                    int old = deque.removeFirst();
                    if (map.get(old) == 1) {
                        map.remove(old);
                    } else {
                        map.merge(old, -1, Integer::sum);
                    }
                }

                // add new value
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
                map.merge(num, 1, Integer::sum);
                max = Math.max(max, map.size());

                if (max == m) {
                    break;
                }
            }

            System.out.println(max);
        }
    }
}