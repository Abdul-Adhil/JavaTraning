
//Prg 7
import java.util.Scanner;

public class LoopWithoutError {

    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Numerator");
            String numerator = scan.nextLine();
            if (numerator.equals("Q") || numerator.equals("q")) {
                break;
            } else {
                System.out.println("Enter the Divisor");
                int divisor = scan.nextInt();

                try {
                    int result = Integer.parseInt(numerator) / divisor;
                    System.out.println("The Result = " + result);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }

    }

}
