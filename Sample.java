
//Prg 2

import java.io.IOException;

public class Sample {

    public void mth1() {
        mth2();
        System.out.println("caller");

    }

    public void mth2() {
        try {
            throw new IOException();
            // return;

        } catch (Exception e) {
            System.out.println("catch-mtch2");

        } finally {
            System.out.println("finally-mtch2");

        }

    }

    public static void main(String args[]) {
        Sample s = new Sample();
        s.mth1();
    }

}
