public class classAB {
    public static void main(String[] args) {

        C classC = new C();

    }
}

class A {
    public A() {
        System.out.println("Constructor of A");
    }
}

class B {
    public B() {
        System.out.println("Constructor of B");
    }
}

class C extends A {

    B classB = new B();

}