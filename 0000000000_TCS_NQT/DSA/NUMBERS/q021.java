package NUMBERS;
// Discriminant:
// d = b^2 - 4ac

// If d > 0 → Roots are real and distinct.
// If d = 0 → Roots are real and equal.
// If d < 0 → Roots are complex.

// Formula:
// x = (-b ± √d) / (2a)

// 🎯 Example Runs
// Input: a = 1, b = -3, c = -10
// Discriminant = 49
// Roots = 5 , -2

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        // Discriminant
        double d = b * b - 4 * a * c;

        if (d > 0) {
            // Real and different roots
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different: " + root1 + " , " + root2);
        } else if (d == 0) {
            // Real and equal roots
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal: " + root + " , " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex: " + realPart + " + i" + imagPart + " , " + realPart + " - i" + imagPart);
        }
    }
}
