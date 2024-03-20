import java.util.Scanner;

public class largestno_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        int z = Math.max(a, b);
        System.err.println(z);
        System.out.println("largest no. is " + max);
    }
}
