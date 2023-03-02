public class CountTheWordP2 {

    public static void main(String[] args) {
        int count = 0;
        String str = "Program to print the number";
        String[] arrOfStr = str.split(" ");

        for (String a : arrOfStr)
            count++;
        System.out.println("Total count: " + count);
    }

}
