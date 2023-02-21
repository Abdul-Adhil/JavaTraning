public class StudentResult {
    public static void main(String[] args) {
        Result result = new Result();

        result.name = "Abdul Adhil";
        result.roll = 102;
        result.mark1 = 80;
        result.mark2 = 85;
        result.mark3 = 90;

        result.markSheet();

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

        totalMark += mark1 + mark2 + mark3;
        System.out.println("Total Mark: " + totalMark);
    }

    public void markSheet() {
        System.out.println("-----------------------");
        printMark();
        total();
        System.out.println("----------------------");

    }

}