public class WithoutCatch {

    static void myMethod() {
        throw new myException();

    }

    public static void main(String[] args) {
        myMethod();
    }
}

class myException extends Exception {
    // Exception class
}