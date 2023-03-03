package ImgcopyP5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Imgcopy {

    public static void main(String[] args) throws Exception {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(
                    new File("/Users/abduladhil/vs-code/Java-Program/ImgcopyP5/taj-mahal-colored.jpeg"));
            os = new FileOutputStream(
                    new File("/Users/abduladhil/vs-code/Java-Program/ImgcopyP5/taj-mahal-black.jpeg"));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) != -1) {
                os.write(buffer);
            }
            System.out.println("Image copied is Successful....!!!");
        } finally {
            is.close();
            os.close();

        }

    }

}
