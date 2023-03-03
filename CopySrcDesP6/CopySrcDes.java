package CopySrcDesP6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopySrcDes {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("/Users/abduladhil/vs-code/Java-Program/CopySrcDes/src.txt");
            FileWriter fw = new FileWriter("/Users/abduladhil/vs-code/Java-Program/CopySrcDes/des.txt");
            String str = "";
            int i;

            while ((i = fr.read()) != -1) {
                str += (char) i;

            }

            fw.write(str);
            fr.close();
            fw.close();
            System.out.println("File copied..!!");

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
