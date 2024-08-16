package module_11;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class aInputOutputStream {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream file = new FileInputStream("ABC.txt");
            FileOutputStream file2 = new FileOutputStream("DEF.txt");
            // byte[] a = file.readAllBytes();
            // System.out.println(a);

            int i;
            
            while ((i = file.read())!=-1) {
                file2.write((char)i);
            }
            file.close();
            file2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
