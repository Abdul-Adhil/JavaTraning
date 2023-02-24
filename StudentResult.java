
//D2 -14
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of data to be displayed :");
        int numberOfData = scan.nextInt();

        for (int iteration = 0; iteration < numberOfData; iteration++) {
            Result result = new Result();

            System.out.println("Enter the Name :");
            String name = scan.next();

            System.out.println("Enter the Rool number");
            int roll = scan.nextInt();
            System.out.println("Enter the Mark 1 :");
            int mark1 = scan.nextInt();
            System.out.println("Enter the Mark 2 :");
            int mark2 = scan.nextInt();
            System.out.println("Enter the Mark 3 :");
            int mark3 = scan.nextInt();

            result.name = name;
            result.roll = roll;
            result.mark1 = mark1;
            result.mark2 = mark2;
            result.mark3 = mark3;
            result.markSheet();

        }

    }

}

class Student {

    String name;
    int roll;

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}

class Exam extends Student {
    int mark1;
    int mark2;
    int mark3;

    public void printMark() {
        printData();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);

    }

}

class Result extends Exam {
    int totalMark;

    public void total() {

        totalMark += this.mark1 + this.mark2 + mark3;
        System.out.println("Total Mark: " + totalMark);
    }

    public void markSheet() {
        System.out.println("-----------------------");
        printMark();
        total();
        System.out.println("----------------------");

    }

}