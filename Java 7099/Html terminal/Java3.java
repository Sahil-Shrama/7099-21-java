
/**
 * The Java3 class prompts the user to enter two numbers 
 * and then calculates and prints their product.
 */
import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        Multiply obj = new Multiply();

    }
}

class Multiply {

    Multiply() {
        Scanner foo = new Scanner(System.in);
        System.out.println("Program to print multiply of number");

        System.out.println("Enter first number");
        int a = foo.nextInt();

        System.out.println("Enter second number");
        int b = foo.nextInt();
        System.out.println("Product is " + a * b);

    }

}
