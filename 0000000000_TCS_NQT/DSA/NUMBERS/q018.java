package NUMBERS;
//Given an integer num, repeatedly add all its digits until the result has only one digit, and return i .
//Input: 529 → First sum = 16 → Next sum = 7 → Output: 7.
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Repeat until single digit
        while (num >= 10) {
            int sum = 0;
            int temp = num;

            // Sum digits
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            num = sum; // update number with digit sum
        }

        System.out.println("Result = " + num);
    }
}
