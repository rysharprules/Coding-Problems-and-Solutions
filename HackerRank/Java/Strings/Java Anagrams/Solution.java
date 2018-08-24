class Solution {
    static boolean isAnagram(String a, String b) {

        if (a == null || b == null || a.equals("") || b.equals(""))
            return false;

        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        // to store all character as per its value
        int map[] = new int[256];

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            map[ch] += 1;
        }

        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (map[ch] == 0) {
                return false;
            } else {
                map[ch] -= 1;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}