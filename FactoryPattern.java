import java.util.Scanner;

public class FactoryPattern {
    public static void main(String[] args) {
        MahindraCarFactory carFactory = new MahindraCarFactory();
        Scanner scan = new Scanner(System.in);
        String car = scan.nextLine();
        Car carType = carFactory.getInstance(car);
        carType.bodyType();

    }

}

class MahindraCarFactory {

    public Car getInstance(String str) {

        if (str.equals("Hatchback") || str.equals("hatchback")) {
            return new Hatchback();
        } else if (str.equals(" Sedan") || str.equals(" sedan")) {
            return new Sedan();
        } else {
            return new PickupTrucks();
        }

    }

}

interface Car {
    public void bodyType();
}

class Hatchback implements Car {

    @Override
    public void bodyType() {
        System.out.println(
                "!!!...Four doors along with an additional rear hatch that opens upward to access the boot space...!!! ");
        String y = Character.toString(128_512);
        System.out.println(y);
    }
}

class Sedan implements Car {

    @Override
    public void bodyType() {
        System.out.println(
                "!!!...Designed to provide utmost comfort and convenience for passengers both at the front as well as the rear...!!!");
    }

}

// class Suv implements Car {

// @Override
// public void bodyType() {
// System.out.println(
// "!!!...both passenger vehicles as well as off-roaders...!!!🚗");
// }

// }

class PickupTrucks implements Car {

    @Override
    public void bodyType() {
        System.out.println(
                "!!!...A large open cargo space behind the passenger section...!!!");
    }

}

// else if (str.equals(" Suv") || str.equals(" suv")) {
// return new Suv();
// }