package module_15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class aTryResource {
    public static void main(String[] args) throws IOException{
        try (
            Scanner sc = new Scanner(System.in);
        ) {
            String data = sc.nextLine();
            System.out.println(data);
        }
        
        try (
            FileInputStream file = new FileInputStream("ABC.txt");
        ) {
            int i;
            while ((i = file.read()) != -1) {
                System.out.println((char)i);
            }
        }
    }
}
