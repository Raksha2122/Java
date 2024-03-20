import java.util.Scanner;

public class Java1 {
    // for class name always use capital letter nad keep it public
    // public means this class accessable to everyone
    public static void main(String[] args) {
        /* Command line argument */
        System.out.println("Hello world");
        System.out.println("My name is Raksha");
        // How to take input in java
        Scanner input = new Scanner(System.in);// variable is input
        // system.in means we are taking nput from keyboard
        System.out.println(input.nextLine());// GIVE complete line of code
        System.out.println(input.next()); // give 1 st word from the code
        System.out.println(input.nextInt()); // gives integer /number vales only otherwise gives error

    }
}