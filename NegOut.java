
//prg 9

import java.util.Scanner;

public class NegOut {

    public static void main(String[] args) throws OutOfRangeException {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int iteration = 0;
        while (iteration < 10) {
            System.out.println("Enter marks of student " + (iteration + 1));
            try {
                int mark = scan.nextInt();
                if (mark < 0) {
                    try {
                        throw new OutOfRangeException("Its is a negative value");
                    } catch (OutOfRangeException e) {
                        System.out.println(e);

                        scan.next();

                    }
                }
                if (mark > 100) {
                    try {
                        throw new OutOfRangeException("Value is above 100");
                    } catch (OutOfRangeException e) {
                        System.out.println(e);

                        scan.next();

                    }
                }

                total += mark;
                iteration++;
            } catch (Exception e) {
                System.out.println(e);

                scan.next();// new piece of code which parses the wrong input and clears the //scanner for
                // new input

            }

        }
        System.out.println("The Total = " + (double) total / 10);
    }

}

class OutOfRangeException extends Exception {
    String msg;

    OutOfRangeException(String message) {
        msg = message;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return msg;
    }

}