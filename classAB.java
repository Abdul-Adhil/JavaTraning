//D2 -10
public class classAB {
    public static void main(String[] args) {

        C classC = new C();
        // B classb = new B();

    }
}

class A {
    A() { // class to be instantiated from any where
        System.out.println("Constructor of A");
    }
}

class B {
    B() {
        System.out.println("Constructor of B");
    }
}

class C extends A {

    B classB = new B();

}
// private - The code is only accessible within the declared class
// protected - The code is accessible in the same package and subclasses