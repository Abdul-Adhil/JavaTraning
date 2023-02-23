public class WithoutCatch {

    static void myMethod() {
        throw new MyException();

    }

    public static void main(String[] args) {
        myMethod();
    }
}

class MyException extends Exception {
    // Exception class
}