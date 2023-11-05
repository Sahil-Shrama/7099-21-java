/**
 * The Java6 class swaps the values of two variables and prints the result.
 */
public class Java6 {
 int a= 12 ,b=13;



public static void main(String[] args) {
    Java6 foo = new Java6();
    
    
    System.out.println("Two numbers before swaping " +foo.a+"  "+foo.b);
    System.out.println("after swaping ");
    
    System.out.println("swaping");
   
    int temp;
    temp = foo.a;
    
    foo.a= foo.b;
    foo.b=temp;
    System.out.println("Two numbers before swaping " +foo.a+"  "+foo.b);

}    
}


// The code is a Java6 class that has two variables, a and b.
// The main method of the class is called with an array of String objects as arguments.
// Inside the main method, there is a new instance of this class called foo.
// It then prints out "Two numbers before swaping 12 13" to show what values are in each variable before swapping them.
// Then it prints out "after swaping 13 12".
// After that, it creates an integer variable named temp and assigns its value to be equal to the value of foo's variable a.
// Then it changes the value of foo's variable b from being equal to temp into being equal to its original value which was 13.
// Finally, after changing all these values back again, it prints out "Two numbers before swaping 12 13".
// The code will print: Two numbers before swaping 12 13 after swaping swapping