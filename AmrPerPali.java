
//Prg D1 - 15
import java.util.Scanner;
import java.lang.Math;

public class AmrPerPali {

    static void isArmstrongNo(int number) {
        int digit = 0, last = 0, sum = 0;
        int temp = number;

        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        temp = number;
        while (temp > 0) {

            last = temp % 10;

            sum += Math.pow(last, digit);
            temp = temp / 10;

        }
        if (number == sum)
            System.out.println(number + " is Armstrong Number!!");
        else
            System.out.println(number + " is not an Amrstrong Number!!");

    }

    static void isPalindrome(int number) {
        int reverse = 0;
        int sum = 0;
        int temp = number;

        while (number > 0) {
            reverse = number % 10;
            sum = (sum * 10) + reverse;
            number = number / 10;
        }

        if (temp == sum)
            System.out.println(temp + " is Palindrome!!");
        else
            System.out.println(temp + " is not an Palindrome!!");

    }

    static void isPerfectNo(int number) {
        int sum = 0;
        int temp = number;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }
        if (number == sum)
            System.out.println(number + " is a Perfect Number!!");
        else
            System.out.println(number + " is not a Perfect Number!!");
    }

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1 for Armstrong Number");
        System.out.println("Enter 2 for Perfect Number");
        System.out.println("Enter 3 for Palindrome Number");
        int option = scan.nextInt();

        switch (option) {

            case 1:
                System.out.println("Enter the Number");
                number = scan.nextInt();
                isArmstrongNo(number);
            case 2:
                System.out.println("Enter the Number");
                number = scan.nextInt();
                isPerfectNo(number);

            case 3:
                System.out.println("Enter the Number");
                number = scan.nextInt();
                isPalindrome(number);

        }

    }
}
