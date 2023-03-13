package DateCopyP8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class DateObj {
    public static void main(String[] args) throws Exception {

        Date d = new Date();

        try {
            FileOutputStream fos = new FileOutputStream("/Users/abduladhil/vs-code/Java-Program/DateCopyP8/date.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(d);

            Thread.sleep(1000);

            FileInputStream fis = new FileInputStream("/Users/abduladhil/vs-code/Java-Program/DateCopyP8/date.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Date date =  (Date) ois.readObject();
            System.out.println(date);
            String st = (String) ois.toString();
            System.out.println(st);

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
