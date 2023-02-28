
//prg 9
import java.util.InputMismatchException;
import java.util.Scanner;

public class NegOut {

    public static void main(String[] args) throws NegativeException {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int iteration = 0;
        while (iteration <= 10) {
            System.out.println("Enter marks of student " + (iteration + 1));
            try {
                int mark = scan.nextInt();
                if (mark < 0) {
                    try {
                        throw new NegativeException();
                    } catch (NegativeException e) {
                        System.out.println(e);
                        continue;
                    }
                }
                if (mark > 100) {
                    try {
                        throw new OutOfRangeException();
                    } catch (OutOfRangeException e) {
                        System.out.println(e);
                        continue;
                    }
                }

                total += mark;
                iteration++;
                if (iteration == 10)
                    break;
            } catch (Exception e) {
                System.out.println(e);

                scan.next();// new piece of code which parses the wrong input and clears the //scanner for
                // new input
                continue;

            }

        }
        System.out.println("The Total = " + (double) total / 10.0);
    }

}

class NegativeException extends Exception {

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Its is a negative value";
    }

}

class OutOfRangeException extends Exception {

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Value is out of range";
    }

}