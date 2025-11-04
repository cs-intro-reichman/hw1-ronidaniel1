// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
    public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int a = (int) (Math.random() * lim);
        int b = (int) (Math.random() * lim);
        int c = (int) (Math.random() * lim);
        System.out.println(a + " " + b + " " + c);

        int d = Math.min(a, b);
        int e = Math.min(d, c);
        int f = Math.max(a, b);
        int g = Math.max(f, c);
        int h = a + b + c - e - g;
    }
}
