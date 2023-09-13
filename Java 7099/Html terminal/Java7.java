

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