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
