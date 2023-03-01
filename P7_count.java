import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class P7_count {
    /**
     * This thread will continue upto 100 count and for every tenth count it will
     * print a String
     * 
     * @return Nothing.
     * @exception InterruptedException.
     * @see InterruptedException
     */

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(1);
        es.execute(() -> {
            for (int count = 1; count < 100; count++) {

                System.out.println(count);
                try {
                    Thread.sleep(1000);
                    if (count % 10 == 0) {
                        System.out.println(count / 10 + " - Ten Number");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }
}