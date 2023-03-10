import java.util.Scanner;

public class CountTheWordP2 {

    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String[] arrOfStr = str.split(" ");

        for (String a : arrOfStr) {
            System.out.println(a);
            count++;
        }
        System.out.println("Total count: " + count);
    }

}
