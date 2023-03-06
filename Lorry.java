import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

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

        System.out.println("Starting Day: " + date);

        if (availableHour > 8)
            System.out.println("started time: " + startTime);

        /*
         * if the coveredDistance is less than distance it will keep on looping
         */

        while (coveredDistance < tempDistance) {

            /*
             * if it is sunday or it is independence day or republic day if() condition will
             * skip that day
             */
            DayOfWeek day = date.getDayOfWeek();

            if (day.getValue() == 7 || (date.getMonthValue() == 1 && date.getDayOfMonth() == 26)
                    || (date.getMonthValue() == 8 && date.getDayOfMonth() == 15)) {

                date = date.plusDays(1);

                continue;

            }

            /*
             * if the hour is greater than 8 it will get inside the for() loop and plus the
             * time and add the covered distance
             */

            if (availableHour > 8) {
                int i;

                for (i = 0; i < 8 && distance > 0; i++) {

                    coveredDistance += speed * 1;
                    time = time.plusHours(1);
                    distanceNeedToCover = distance - speed * 1;
                    distance = distanceNeedToCover;

                }
                /*
                 * if condition checks whether 8hr a day completed. if 8hr work completed it
                 * will update the time and date
                 */
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
