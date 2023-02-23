import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int iteration = 0;
        while (iteration <= 10) {
            System.out.println("Enter marks of student " + (iteration + 1));
            try {
                int mark = scan.nextInt();
                total += mark;
                iteration++;
                if (iteration == 10)
                    break;
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid number....");
                scan.next();// new piece of code which parses the wrong input and clears the //scanner for
                // new input
                continue;

            }

        }
        System.out.println("The Total = " + (double) total / 10.0);
    }

}
