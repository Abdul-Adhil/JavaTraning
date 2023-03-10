package CopyLineByLineP7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLineByLine {
    public static void main(String[] args) {

        try {
            BufferedReader fr = new BufferedReader(
                    new FileReader("//Users/abduladhil/vs-code/Java-Program/CopyLineByLineP7/s.txt"));
            PrintWriter fw = new PrintWriter(
                    new FileWriter("/Users/abduladhil/vs-code/Java-Program/CopyLineByLineP7/d.txt"));
            String str = "";
            int count = 0;

            while ((str = fr.readLine()) != null) {

                if (count < 3) {
                    fw.println(str);
                    count++;
                }

            }
            // System.out.println(str);

            fr.close();
            fw.close();
            System.out.println("File copied..!!");

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
