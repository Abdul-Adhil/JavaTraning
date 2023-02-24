import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class P4_DigitalClock {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(3);

        int hour = LocalTime.now().getHour();
        int minute = LocalTime.now().getMinute();
        int second = LocalTime.now().getSecond();
        DisplayTime displayTime = new DisplayTime(hour, minute, second);

        es.execute(() -> {
            while (true) {
                displayTime.second();
            }

        });
        es.execute(() -> {
            while (true) {
                displayTime.minute();
            }

        });
        es.execute(() -> {
            while (true) {
                displayTime.hour();
            }

        });
    }

}

class DisplayTime {

    private int hour;
    private int minute;
    private int second;

    public DisplayTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    synchronized public void hour() {

    }

    synchronized public void minute() {
    }

    synchronized public void second() {

        if (second == 60) {
            try {
                wait();

            } catch (Exception e) {

            }
        }
        for (int i = second; i < 60; i++) {
            System.out.println(hour + ":" + minute + ":" + second);
            second += 1;
        }
        second = 60;
        notifyAll();

    }

}