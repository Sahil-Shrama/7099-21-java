/**
 * The Java4 class calculates and prints the average
 *  of five numbers inputted by the user.
 */
import java.util.Scanner;

public class Java5 {
    public static void average(){
    Scanner foo = new Scanner(System.in);
    System.out.println("Input First number  ");
    int a = foo.nextInt();
    System.out.println("Input Second number  ");
    int b = foo.nextInt();
    System.out.println("Input third number  ");
    int c = foo.nextInt();
    System.out.println("Input Fourth number  ");
    int d = foo.nextInt();
    System.out.println("Input Fifth number  ");
    int e = foo.nextInt();
    System.out.println("Printing the average of five Numbers" );
    double f = (double) + (a+b+c+d+e)/5 ;
    System.out.print(" "+f);
    System.out.println("");



    }
    public static void main(String[] args) {
        average();
    }


}

 The code is a Java program that asks the user to input five numbers.
The program then calculates and prints the average of those five numbers.
The code starts by declaring variables for an input stream, which is used to read in data from the keyboard, and a variable for storing the output stream, which will print out what it has calculated.
It also declares two methods: one called "average" that takes no parameters and returns nothing; and another called "main" that takes no parameters but calls average() when it is run.
The code is an example of how to use a Scanner object.