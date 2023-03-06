import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Lorry {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Speed:");
        int speed = scan.nextInt();
        System.out.println("Enter the Distance");
        int distance = scan.nextInt();
        int tempDistance = distance;

        scan.close();

        int coveredDistance = 0;
        int distanceNeedToCover = 0;

        // LocalDate date = LocalDate.now();

        LocalDate date = LocalDate.of(2023, 1, 25);
        LocalTime time = LocalTime.parse("02:01:50.63");
        LocalTime startTime = time;

        LocalDate StartDate = date;

        LocalTime avlTime = time.minus(Duration.ofMinutes(59));
        // System.out.println("The available Time: " + avlTime);

        int availableHour = 23 - avlTime.getHour();
        // int availableMinute = 59 - time.getMinute();

        // System.out.println(availableHour);

        System.out.println("Starting Day: " + date);

        if (availableHour > 8)
            System.out.println("started time: " + startTime);

        while (coveredDistance < tempDistance) {
            DayOfWeek day = date.getDayOfWeek();

            if (day.getValue() == 7 || (date.getMonthValue() == 1 && date.getDayOfMonth() == 26)
                    || (date.getMonthValue() == 8 && date.getDayOfMonth() == 15)) {

                date = date.plusDays(1);

                continue;

            }

            if (availableHour > 8) {
                int i;

                for (i = 0; i < 8 && distance > 0; i++) {

                    coveredDistance += speed * 1;
                    time = time.plusHours(1);
                    distanceNeedToCover = distance - speed * 1;
                    distance = distanceNeedToCover;

                }
                if (i == 8) {
                    date = date.plusDays(1);
                    time = startTime;
                }

            } else {
                date = date.plusDays(1);

                time = time.minusHours(8);
                startTime = time;
                System.out.println("started time: " + time);

                availableHour = 23;

            }
        }

        System.out.println("Delivery Day:" + date);
        System.out.println("Delivery  time: " + time);

    }

}
/*
 * i seed distance
 * 80/hr 8hr 640km cus 1000
 * 
 * out date time
 */