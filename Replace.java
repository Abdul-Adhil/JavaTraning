
//Prg 3

public class Replace {
    public void mth1() {
        mth2();
        System.out.println("caller");

    }

    public void mth2() {
        try {
            // throw new IOException();
            // return;

            System.exit(0); // System.exit(0) method terminates JVM which results in termination of the
                            // currently running program

        } catch (Exception e) {
            System.out.println("catch-mtch2");

        } finally {
            System.out.println("finally-mtch2");

        }

    }

    public static void main(String args[]) {
        Replace s = new Replace();
        s.mth1();
    }
}
