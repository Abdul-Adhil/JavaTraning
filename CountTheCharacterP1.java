
//Prg1
import java.util.Scanner;

public class CountTheCharacterP1 {

    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        try {
            while (scan.hasNext()) {
                String character = scan.next();
                count++;
            }

        } finally {
            scan.close();
            System.out.println("The count: " + count);

        }

    }

}
