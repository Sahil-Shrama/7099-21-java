/**
 * The above Java class prints all prime numbers from 1 to 100.
 */
import java.util.Scanner;
class java20
{
   public static void main (String[] args)
   {		
      
      int i =0;
      int num =0;
      
      String  primeNumbers = " ";
      for (i = 1; i <= 100; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    //Appended the Prime number to the String
	    primeNumbers = primeNumbers + i+" ";
	 }	
      }	
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(primeNumbers);
   }
}


// The code starts with a class definition and the main method.
// The main method starts by declaring an int variable called i, which is initialized to 0.
// Next, it declares another int variable called num, which is also initialized to 0.
// Then it creates a string variable called primeNumbers that will be used in the for loop.
// The first line of code inside the for loop increments counter from 1 to 100 using a while loop (while(num>=1) {).
// If counter reaches 2 then prime numbers are appended onto the end of primeNumbers and then printed out on System.out using println().
// The code is used to print the prime numbers from 1 to 100.