package FileOnConsole;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileOnConsole {
    public static void main(String[] args) {

        FileReader file;
        String line = null;

        try {
            file = new FileReader("/Users/abduladhil/vs-code/Java-Program/FileOnConsole/text.txt");
            BufferedReader br = new BufferedReader(file);
            try {
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {

                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

    }
}
