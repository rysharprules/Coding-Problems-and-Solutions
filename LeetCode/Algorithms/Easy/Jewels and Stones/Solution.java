class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for(char c : J.toCharArray()) {
            for(int i = 0; i < S.length(); i++){
                if(c == S.charAt(i)) count++;
            }
        }
        return count;
    }
}