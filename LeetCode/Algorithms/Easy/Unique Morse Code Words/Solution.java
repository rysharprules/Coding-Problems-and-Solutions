import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> converted = new HashSet<>();
        for(String word : words) {
            String convert = "";
            for(char c : word.toCharArray()) {
                convert += morse[c - 97]; // rather than the ASCII code, could of used 'a'
            }
            converted.add(convert);
        }
        return converted.size();
    }
}