import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P3_Inventory {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        Inventory inventory = new Inventory();

        es.execute(() -> {
            inventory.sell();
            inventory.sell();
            inventory.sell();
            inventory.sell();

        });

        es.execute(() -> {
            inventory.store();
            inventory.store();
            inventory.store();
            inventory.store();
            inventory.store();

        });

        es.shutdown();

    }

}

class Inventory {

    /**
     * This is the synchronized method which is used to store and sell the product
     * in inventory
     * when there is no product store() method add the product to inventory
     * when there is atleast one product in inventory sell() method sell the product
     * by wait() and notify()
     * 
     * @return Nothing.
     *         .
     * @see Exception
     */

    int product = 0;

    synchronized public void store() {

        if (product != 0) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        System.out.println("Product added in Inventory");

        product++;

        notify();

    }

    synchronized public void sell() {
        if (product == 0) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println("Product saled to a customer");
        product--;
        notify();

    }
}