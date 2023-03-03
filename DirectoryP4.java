import java.io.File;
import java.util.Scanner;

public class DirectoryP4 {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // String path = scan.next();
        File dir = new File(args[0]);

        String[] content = dir.list();

        for (int i = 0; i < content.length; i++) {
            System.out.println(content[i]);
        }

    }

}

// "/Users/abduladhil/vs-code/Java-Program"