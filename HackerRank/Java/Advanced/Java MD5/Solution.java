import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception{
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.nextLine();
        }

        // encode
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte[] digest = md.digest();

        // print in hex
        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}