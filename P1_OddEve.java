
//D-5 p1

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P1_OddEve {

    public static void main(String[] args) {
        ExecutorService executeThread = Executors.newFixedThreadPool(2);
        Number number = new Number();

        executeThread.execute(() -> {
            number.odd();
        });

        executeThread.execute(() -> {
            number.even();
        });

    }
}

class Number {
    synchronized public void odd() {
        System.out.println("Odd");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println("");
    }

    public void even() {
        System.out.println("Even");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}