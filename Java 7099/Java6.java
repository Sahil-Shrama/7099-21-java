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
