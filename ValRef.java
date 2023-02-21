public class ValRef {

    int num = 50;

    void changeVal(int num) {
        num = num + 100;
    }

    void changeRef(ValRef ref) {
        ref.num = ref.num + 150;
    }

    public static void changeContent(int[] arr) {
        arr[0] = 99;
    }

    public static void main(String[] args) {

        ValRef ref = new ValRef();// object creation
        int[] arr = { 1, 2 };

        // value
        System.out.println("Value Before changes " + ref.num);
        ref.changeVal(500);
        System.out.println("Value After changes " + ref.num);

        System.out.println();
        // Reference
        System.out.println("Reference Before changes " + ref.num);
        // Passing an object
        ref.changeRef(ref);
        System.out.println("Reference Before changes " + ref.num);

        System.out.println();

        // Array
        System.out.println("Before passing the array " + arr[0]);

        // passing an array
        changeContent(arr);

        System.out.println("Before passing the array" + arr[0]);

    }
}
