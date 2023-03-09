public class Singleton {
    public static void main(String[] args) {

        SingletonClass s = SingletonClass.getInstance();
        SingletonClass s1 = SingletonClass.getInstance();

        System.out.println(s);
        System.out.println(s1);

    }

}

/**
 * This is the singleton class which return a singleton object.
 * 
 * @param args Unused.
 * @return singleton object.
 * 
 * 
 */

class SingletonClass {

    private static SingletonClass singletonClass = null;

    private SingletonClass() {
        System.out.println("Singleton object is created");
    }

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
            return singletonClass;
        } else {
            return singletonClass;
        }

    }

}