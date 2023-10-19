/**
 * The Main class in Java converts a binary number inputted by the user into its decimal equivalent.
 */
import java.util.Scanner;

public class Java8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a binary number: ");
    String binaryString = scanner.nextLine();

    int decimal = binaryToDecimal(binaryString);

    System.out.println("The decimal value of the binary number is " + decimal);
  }

  public static int binaryToDecimal(String binaryString) {
    int decimal = 0;
    int base = 1;
    int temp = Integer.parseInt(binaryString);
    while (temp > 0) {
      int digit = temp % 10;
      decimal += digit * base;
      base = base * 2;
      temp = temp / 10;
    }
    return decimal;
  }
}


The code starts by declaring a Scanner object.
The next line asks the user to enter a binary number, which is then converted into an int using the binaryToDecimal() method.
The code starts by declaring a Scanner object.
The next line asks the user to enter a binary number, which is then converted into an int using the binaryToDecimal() method.
The code is written in Java 8.
It uses the Scanner class to parse a string and convert it into an integer.