//Prg 5
public class WithoutCatch {

    static void myMethod() {
        throw new MyException();

    }

    public static void main(String[] args) {
        myMethod();
    }
}

class MyException extends Exception {

    @Override
    public String toString() {
        return "MyException: Somethig went wrong";
    }

}