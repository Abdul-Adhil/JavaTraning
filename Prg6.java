//Prg 6
public class Prg6 {
    public static void main(String[] args) {

        Base derived = new Derived();

    }
}

class Base {

    void myMethod() {
        int integer = 1 / 0;

    }
}

class Derived extends Base {

    public Derived() {

        try {
            Base base = new Base();
            base.myMethod();

        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (Exception error) {
            error.printStackTrace();

        }

    }

}
