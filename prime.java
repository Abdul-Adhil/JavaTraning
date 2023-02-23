
//Prg D1 - 15
import java.util.Scanner;

public class prime {

    static void generatePrimeNo(int range) {
        int flag;
        for (int number = 1; number <= range; number++) {
            if (number == 0 || number == 1)
                continue;
            flag = 1;
            for (int iteration = 2; iteration <= number / 2; ++iteration) {
                if (number % iteration == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();

        generatePrimeNo(range);

    }

}
