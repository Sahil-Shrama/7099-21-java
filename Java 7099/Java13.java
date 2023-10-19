/**
 * This Java program takes a character input from the user and prints its ASCII value.
 */
import java.util.Scanner;
public class Java13 {
    public static void main(String[] args) {
        System.out.println("Enter characte rfor Assic value ");
        Scanner foo = new Scanner(System.in);
        char ch = foo.next().charAt(0);
        int a = ch;
        System.out.println("assic value is "+a);
        
    }
}



The code asks the user to enter a character for an Assic value.
The code then uses a Scanner object to read from the keyboard and converts it into a char variable.
The code then assigns this char variable to be equal to the first character of input, which is ch.
Then, using an int variable called a, the program calculates what would be equivalent in decimal form if you were multiplying by 1000000 (a=10000).
The program prints out "assic value is 10000".
The code is used to input a character and assign it an integer value.