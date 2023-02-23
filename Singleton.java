//D2 - 8
public class Singleton {
    public static void main(String[] args) {
        SingletonClass si = SingletonClass.getInstance();
        SingletonClass si2 = SingletonClass.getInstance();

        System.out.println(si);
        System.out.println(si2);

    }
}

class SingletonClass {

    private static SingletonClass singletonclass = null;

    private SingletonClass() { // constructor

        System.out.println("Singleton object is created");
    };

    public static SingletonClass getInstance() { // factory method
        if (singletonclass == null) {
            singletonclass = new SingletonClass();
            return singletonclass;
        } else {
            return singletonclass;
        }

    }

}