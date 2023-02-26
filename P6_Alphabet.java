import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;

public class P6_Alphabet {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(1);
        Alph alphabetCount = new Alph();

        es.execute(() -> {

            while (true) {
                alphabetCount.countAlphabet();
            }
        });
        es.shutdown();
    }

}

class Alph {
    int count = 0;

    void countAlphabet() {

        System.out.println("Enter a Character: ");
        Scanner scan = new Scanner(System.in);
        char c = (char) scan.next().charAt(0);

        try {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                count++;
            else
                throw new NotLetterException();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Total Count: " + count);

            System.exit(0);

        }

    }

}

class NotLetterException extends Exception {

    @Override
    public String toString() {
        return "Not a Letter Exception";
    }

}
