package module_14;

import java.util.Base64;

public class aBase64EnDe {
    public static void main(String[] args) {
        String obj = "Hello World";
        byte[] data = obj.getBytes();
        String encoded = Base64.getEncoder().encodeToString(data);
        System.out.println(encoded);

        byte[] decoded = Base64.getDecoder().decode(encoded);
        String decoded2 = new String(decoded);
        System.out.println(decoded2);


    }
}