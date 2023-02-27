
//Prg 2
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P2_DifferentMessage {
    public static void main(String[] args) {
        ExecutorService executeThread = Executors.newFixedThreadPool(2);
        executeThread.execute(() -> {
            Display.message("[------");
        });
        executeThread.execute(() -> {
            Display.message("Message");
        });
        executeThread.execute(() -> {
            Display.message("------]");
        });
        // display.message3();

        executeThread.shutdown();

    }

}

class Display {
    /**
     * This is the synchronized method which is used to display message
     * 
     * @param message.
     * @return Nothing.
     * @exception InterruptedException .
     * @see IOException
     */

    synchronized static public void message(String message) {
        System.out.print(message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

}