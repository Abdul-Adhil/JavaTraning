import java.util.Scanner;
import java.lang.Math;

public class AmrPerPali {

    static void isArmstrongNo(int n) {
        int digit = 0, last = 0, sum = 0;
        int temp = n;

        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        temp = n;
        while (temp > 0) {

            last = temp % 10;

            sum += Math.pow(last, digit);
            temp = temp / 10;

        }
        if (n == sum)
            System.out.println(n + " is Armstrong Number");
        else
            System.out.println(n + " is not an Amrstrong Number");

    }

    static void isPalindrome(int n) {
        int r = 0;
        int sum = 0;
        int temp = n;

        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }

        if (temp == sum)
            System.out.println(temp + " is Palindrome");
        else
            System.out.println(temp + " is not an Palindrome");

    }

    static void isPerfectNo(int n) {
        int sum = 0;
        int temp = n;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (n == sum)
            System.out.println(n + " is a Perfect Number");
        else
            System.out.println(n + " is not a Perfect Number");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        isArmstrongNo(n);
        isPerfectNo(n);
        isPalindrome(n);
    }
}
