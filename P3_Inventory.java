import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P3_Inventory {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        Inventory inventory = new Inventory();

        es.execute(() -> {
            inventory.store();
            inventory.store();
            inventory.store();
        });
        es.execute(() -> {
            inventory.sell();
            inventory.sell();
            inventory.sell();

        });

        es.shutdown();

    }

}

class Inventory {

    int product = 0;

    synchronized public void store() {

        if (product != 0) {
            try {
                wait();
            } catch (Exception e) {

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

            }

        }
        System.out.println("Product saled to a customer");
        product--;
        notify();

    }
}