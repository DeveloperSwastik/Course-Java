package module_11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bCharacterStream {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader file  = new FileReader("ABC.txt");
        FileWriter file2 = new FileWriter("DEF.txt");
        while (file.ready()) {
            int i = file.read();
            System.out.println((char)i);
            file2.write((char)i);
        }
        file.close();
        file2.close();
    }
}
