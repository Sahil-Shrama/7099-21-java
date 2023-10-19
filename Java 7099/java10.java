/**
 * The java10 class takes a number as input and calculates the sum of its digits.
 */
import java.util.Scanner;
public class java10 {
    public static void main(String[] args) {
       
     System.out.println("enter the number whose digit sum to find");
      Scanner foo = new Scanner(System.in);
      int x= foo.nextInt();
      System.out.print("sum is ");
      int sum = 0;
      int var = x;
      while(var!=0)
      {
        int digit = var%10;
         sum += digit;
         var /=10;

      }
        


        
        System.out.println(sum);

        

    }
    
}
The code begins by asking the user to enter a number whose digit sum is to be found.
The code then creates a Scanner object called foo and uses it to read in an integer from the user.
Next, x is set equal to the value of what was just read in from the user.
Then, System.out prints "sum is" followed by an initial value for var which will be 0 until x becomes zero (var!=0).
Next, while(var!=0) loops through 10 times with each iteration printing out digit as it's being calculated and adding that digit's value into sum along with its current position within var (x%10).
Finally, after all 10 iterations have been completed, System.out prints out sum followed by a newline character so that we can see where we are now at in our looping process.
The code iterates through an integer variable x and prints the sum of each digit in the string "sum is " followed by the value of var.
The code above also uses a while loop to print out every digit from 0-9 until x is equal to 0.