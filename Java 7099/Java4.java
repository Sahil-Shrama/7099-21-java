/**
 * The Java4 class takes two numbers and an operation as input from the user and performs the
 * corresponding operation on the numbers.
 */
import java.util.Scanner;
public class Java4 {
    static void operation(){
        System.out.println("Program to print operation in java ");
        Scanner foo = new Scanner(System.in);


        System.out.println("Enter the first number ");
        int a =  foo.nextInt();
        System.out.println("Enter the second number ");
        int b =  foo.nextInt();
         
        System.out.println("Enter the operation you want * / + - ");
        String s = foo.next();

        switch (s) {
            case "*":
                System.out.println("multiplication is"+(a*b));
                break;
            case "+":
                System.out.println("Addition  is"+(a+b));
                break;
            case "/":
                System.out.println("devide is"+(a/b));
                break;
            case "-":
                System.out.println("Subtraction is"+(a-b));
                break;
        
            default:
            System.out.println("Enter correct value");
                break;
        }


    }
    
    public static void main(String[] args) {
        operation();
    }
}

