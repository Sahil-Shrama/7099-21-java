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


The code starts with a comment that says "Program to print operation in java".
This is followed by the declaration of an object called Scanner.
The next line declares a variable called foo which will be used as the input for this program.
The first line asks the user to enter their first number and then prints out what they entered on screen.
Next, it asks them to enter their second number and then prints out what they entered on screen again.
It also tells them that if they want multiplication, addition, or division, they should type "*", "+", or "/" respectively into the text field provided after the switch statement.
If you don't type anything in there, it will default back to printing whatever was typed before (the string s).
The code attempts to print the operation in java.