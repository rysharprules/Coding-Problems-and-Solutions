import java.util.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.nextLine();
        }
        MessageDigest message = MessageDigest.getInstance("SHA-256");
        message.update(s.getBytes());
        byte[] bytes = message.digest();

        for(byte b : bytes){
            System.out.printf("%02x", b);
        }
    }
}