//lcm
// LCM(a, b) = (a * b) / GCD(a, b)

package NUMBERS;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Find GCD using Euclidean Algorithm
        int a = num1, b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;

        // Calculate LCM
        int lcm = (num1 * num2) / gcd;

        System.out.println("LCM = " + lcm);
    }
}
