public class Demo0 {
    static void myfunc() {
        System.out.println("dasdsadasdsa");
    }
    public static void main(String[] args) {
        // Declares an integer variable and sets it to 0
        int i = 0;
        while (i < 6) {
            // Prints i, and increments it
            System.out.println(i);
            i = i + 1;
        }
        myfunc();
        System.out.println("Done");
    }
}