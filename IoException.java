import java.io.IOException;

//Prg 1
class IoException {

    static void myMethod() {
        // throws IOException
        throw new IOException();

        // Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        // IOException cannot be resolved to a type
        // at IoException.myMethod(IoException.java:4)
    }

    public static void main(String[] args) {
        try {
            myMethod();

        } catch (Exception e) {

        }
    }
}