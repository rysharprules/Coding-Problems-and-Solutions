class Solution {
    public String toLowerCase(String str) {
        return str.toLowerCase(); // this feels like cheating. :/
    }

    public String toLowerCaseNoCheating(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (65 <= c && c <= 90) { // within ASCII boundaries of A to Z
                c = (char) (c + 32); // add 32 to make lower case version of same letter, e.g. A (65) becomes a (97)
            }
            sb.append(c);
        }
        return sb.toString();
    }
}