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
    private String formate;

    public DisplayTime(int hour, int minute, int second) {
        if (hour > 12) {
            this.hour = hour - 12;
            this.formate = "PM";
        } else
            this.hour = hour;

        this.minute = minute;
        this.second = second;

    }

    synchronized public void hour() {

        if (minute == 59) {
            minute = 0;
            second = 0;
            hour++;
            if (hour > 12) {
                hour = 1;
                this.formate = "AM";
            }

            try {

                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }

            notifyAll();

        } else {

            try {
                wait();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    synchronized public void minute() {

        if (second == 60 && minute < 59) {

            second = 0;
            minute++;

            try {

                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }

            notifyAll();

        } else {

            try {
                wait();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    synchronized public void second() {

        int i;

        if (second < 60) {

            for (i = second; i < 60; i++) {
                try {

                    Thread.sleep(1000);

                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println(hour + ":" + minute + ":" + i + " " + formate);
            }

            second = i;
            notifyAll();

        } else {

            try {
                wait();

            } catch (Exception e) {
                e.printStackTrace();

            }

        }

    }

}