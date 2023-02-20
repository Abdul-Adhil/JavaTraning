import java.util.Scanner;

public class prime {

    static void generatePrimeNo(int n) {
        int flag;

        for (int x = 1; x <= n; x++) {

            if (x == 0 || x == 1)
                continue;

            flag = 1;
            for (int i = 2; i <= x / 2; ++i) {

                if (x % i == 0) {

                    flag = 0;
                    break;
                }
            }

            if (flag == 1) {
                System.out.print(x + " ");
            }

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        generatePrimeNo(n);

    }

}
