class IoException {

    static void myMethod() {
        throw new IOException();
    }

    public static void main(String[] args) {
        myMethod();
    }
}