
//Prg D1 - 15
import java.util.Scanner;

public class prime {

    static boolean generatePrimeNo(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();

        for (int i = 0; i < range; i++) {
            if (generatePrimeNo(i)) {
                System.out.print(i + " ");
            }

        }

    }

}
