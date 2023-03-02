//Prg 6
public class Prg6 {
    public static void main(String[] args) {

        try {
            Base derived = new Derived();
        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}

class Base {

    void myMethod() {
        int integer = 1 / 0;

    }
}

class Derived extends Base {

    public Derived() throws Exception {

        Base base = new Base();
        base.myMethod();

    }

}
