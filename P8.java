import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P8 {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(3);
        StringBuffer sbObj = new StringBuffer("A");
        MyThread objBuff = new MyThread(sbObj);

        es.execute(() -> {
            objBuff.run();
        });
        es.execute(() -> {
            objBuff.run();
        });
        es.execute(() -> {
            objBuff.run();
        });
        es.shutdown();

    }

}

class MyThread extends Thread {

    StringBuffer buffer;

    MyThread(StringBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        synchronized (buffer) {

            for (int i = 0; i < 100; i++) {
                System.out.print(buffer + " ");
            }
            System.out.println();
            char nextChar = buffer.charAt(0);
            nextChar++;
            buffer = buffer.replace(0, 1, String.valueOf(nextChar));

        }

    }

}