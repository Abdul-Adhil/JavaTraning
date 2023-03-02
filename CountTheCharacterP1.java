
//Prg1
import java.util.Scanner;

public class CountTheCharacterP1 {

    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String character = scan.next();
            count++;
        }
        scan.close();
        System.out.println(count);
    }

}
