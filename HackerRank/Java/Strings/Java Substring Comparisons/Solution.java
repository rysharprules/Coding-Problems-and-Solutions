class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int max = s.length();
        int j = 0;
        while (true) {
            if (j + k > max) break;
            j++;
        }
        String[] segments = new String[j];
        int m = 0;
        while (true) {
            if (m + k > max) break;
            segments[m] = (s.substring(m, m + k));
            m++;
        }
        smallest = segments[0];
        largest = segments[0];

        for (int i = 1; i < segments.length; i++) {
            smallest = smallest.compareTo(segments[i]) < 0 ? smallest : segments[i];
            largest = largest.compareTo(segments[i]) > 0 ? largest : segments[i];
        }
        return smallest + "\n" + largest;
    }
}