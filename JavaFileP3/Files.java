package JavaFileP3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Files {

    public static void main(String[] args) {

        Executor es = Executors.newFixedThreadPool(2);
        File myFile = new File("/Users/abduladhil/vs-code/Java-Program/JavaFileP3/newFile.txt");

        try {

            if (myFile.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }

        } catch (Exception e) {
            System.out.println("Error in creating a file: " + e);

        }
        // delete thread

        es.execute(() -> {

            try {

                Thread.sleep(6000);
                deleteFile(myFile);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        });

        // rename thread
        File myFile1 = new File("/Users/abduladhil/vs-code/Java-Program/JavaFileP3/newFile1.txt");

        try {

            if (myFile1.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }

        } catch (Exception e) {
            System.out.println("Error in creating a file: " + e);

        }
        es.execute(() -> {
            try {
                Thread.sleep(7000);
                renameFile(myFile1);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        });

        // length of file
        File f = new File("/Users/abduladhil/vs-code/Java-Program/JavaFileP3/length.txt");
        System.out.println("length: " + f.length());

    }

    // Delete Method

    static void deleteFile(File myFile) {

        try {
            if (myFile.delete()) {
                System.out.println("Deleted the file!");
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // Rename method
    static void renameFile(File myFile) {

        try {
            File rename = new File("/Users/abduladhil/vs-code/Java-Program/JavaFileP3/renameFile.txt");
            if (myFile.renameTo(rename)) {
                System.out.println("File Successfully Rename");
                

            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
