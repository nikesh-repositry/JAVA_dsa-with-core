package NUMBERS;
//Program to Add two fractions
import java.util.Scanner;

public class AddFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input fractions
        System.out.print("Enter numerator1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter denominator1: ");
        int den1 = sc.nextInt();

        System.out.print("Enter numerator2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter denominator2: ");
        int den2 = sc.nextInt();

        // Calculate numerator and denominator of sum
        int numerator = num1 * den2 + num2 * den1;
        int denominator = den1 * den2;

        // Reduce fraction using GCD
        int a = numerator, b = denominator;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;

        numerator /= gcd;
        denominator /= gcd;

        System.out.println("Result: Numerator = " + numerator + ", Denominator = " + denominator);
    }
}
