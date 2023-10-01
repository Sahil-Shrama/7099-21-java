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
