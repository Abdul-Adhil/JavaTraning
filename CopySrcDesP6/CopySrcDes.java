package CopySrcDesP6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopySrcDes {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("/Users/abduladhil/vs-code/Java-Program/CopySrcDesP6/srcFile.txt");
            FileWriter fw = new FileWriter("/Users/abduladhil/vs-code/Java-Program/CopySrcDes/desFile.txt");

            int i;

            while ((i = fr.read()) != -1) {
                fw.write((char) i);

            }

            fr.close();
            fw.close();
            System.out.println("File copied..!!");

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
