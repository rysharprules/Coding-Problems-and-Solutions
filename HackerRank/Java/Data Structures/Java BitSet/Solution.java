import java.util.*;
import java.util.function.*;

// TAG: bitwise
public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int noOperations = sc.nextInt();
            BitSet[] bitSets = new BitSet[]{new BitSet(size), new BitSet(size)};

            Map<String, BiConsumer<Integer, Integer>> ops = new HashMap<>();
            ops.put("AND", (index1, index2) -> bitSets[index1 - 1].and(bitSets[index2 - 1]));
            ops.put("OR", (index1, index2) -> bitSets[index1 - 1].or(bitSets[index2 - 1]));
            ops.put("XOR", (index1, index2) -> bitSets[index1 - 1].xor(bitSets[index2 - 1]));
            ops.put("SET", (index1, index2) -> bitSets[index1 - 1].set(index2));
            ops.put("FLIP", (index1, index2) -> bitSets[index1 - 1].flip(index2));

            for (int i = 0; i < noOperations; i++) {
                ops.get(sc.next()).accept(sc.nextInt(), sc.nextInt());
                System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
            }
        }
    }
}