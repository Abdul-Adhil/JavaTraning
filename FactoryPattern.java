import java.util.Scanner;

public class FactoryPattern {
    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in);) {

            String car = scan.nextLine();

            MahindraCarFactory carFactory = new MahindraCarFactory();
            CarType carType = carFactory.getInstance(car);

            carType.myCar().bodyType();
        }
    }

}

class MahindraCarFactory {

    public CarType getInstance(String str) throws Exception {

        CarType type = (CarType) Class.forName(str).getConstructor().newInstance();
        type.myCar();
        return type;

    }

}

interface CarType {
    public Car myCar();
}

class HatchbackCar implements CarType {

    public HatchbackCar() {
    }

    @Override
    public Car myCar() {
        return new Hatchback();
    }
}

class SedanCar implements CarType {

    public SedanCar() {
    }

    @Override
    public Car myCar() {

        return new Sedan();

    }
}

class PickupTrucksCar implements CarType {

    public PickupTrucksCar() {
    }

    @Override
    public Car myCar() {
        return new PickupTrucks();
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