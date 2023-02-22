class OwnException {

    public static void main(String[] args) {
        try {
            throw new myException();
        } catch (myException e) {

            e.printStackTrace();// is a method used to handle exceptions and errors
            // prints the throwable along with other details like the line number and class
            // name where the exception occurred
        }
    }
}

class myException extends Exception {

}