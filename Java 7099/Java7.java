/**
 * The Java7 class converts a decimal number to its binary representation.
 */


import java.util.Scanner;

public class Java7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNum = input.nextInt();

        String binaryNum = decimalToBinary(decimalNum);
        System.out.println("Binary representation: " + binaryNum);
    }

    public static String decimalToBinary(int decimalNum) {
        StringBuilder binary = new StringBuilder();
        while (decimalNum > 0) {
            binary.insert(0, decimalNum % 2);
            decimalNum /= 2;
        }
        return binary.toString();
    }
}




The code starts by creating a Scanner object called input.
The code then asks the user to enter a decimal number and stores it in an int variable named decimalNum.
Next, the code prints "Enter a decimal number: " and prompts for another digit from the user.
It then uses that digit to create binary representation of the given integer using its modulo operator (%).
Finally, it returns that string as well as displaying it on screen.
The code will output the binary representation of a decimal number.