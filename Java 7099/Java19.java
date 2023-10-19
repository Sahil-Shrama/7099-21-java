/**
 * The Java19 class takes user input for seconds and converts it into minutes and hours.
 */
import java.util.Scanner;
public class Java19 {
    public static void main(String[] args) {
        System.out.println("enter seconds");
        Scanner foo = new Scanner(System.in);
        int n = foo.nextInt();
        System.out.println("in minutes "+n/60);
        System.out.println("in hours "+n/3600);

        
    }
}


The code asks the user to enter seconds.
The code then prints out "in minutes" and "in hours."
The code will print out: in minutes 0 in hours 0