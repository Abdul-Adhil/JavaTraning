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
                    new FileReader("/Users/abduladhil/vs-code/Java-Program/CopyLineByLine/s.txt"));
            PrintWriter fw = new PrintWriter(
                    new FileWriter("/Users/abduladhil/vs-code/Java-Program/CopyLineByLine/d.txt"));
            String str = "";

            while ((str = fr.readLine()) != null) {

                fw.println(str);

            }
            System.out.println(str);

            fr.close();
            fw.close();
            System.out.println("File copied..!!");

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
