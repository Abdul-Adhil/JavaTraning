public class FactoryPattern {
    public static void main(String[] args) {
        Car c = new Hatchback();
        c.bodyType();
    }

}

class CarFactory {

}

interface Car {
    public void bodyType();
}

class Hatchback implements Car {

    @Override
    public void bodyType() {
        System.out.println(
                "!!!...Four doors along with an additional rear hatch that opens upward to access the boot space...!!!");
    }
}

class Sedan implements Car {

    @Override
    public void bodyType() {
        System.out.println(
                "!!!...Designed to provide utmost comfort and convenience for passengers both at the front as well as the rear...!!!");
    }

}

class Suv implements Car {

    @Override
    public void bodyType() {
        System.out.println(
                "!!!...both passenger vehicles as well as off-roaders...!!!");
    }

}

class PickupTrucks implements Car {

    @Override
    public void bodyType() {
        System.out.println(
                "!!!...A large open cargo space behind the passenger section...!!!");
    }

}
