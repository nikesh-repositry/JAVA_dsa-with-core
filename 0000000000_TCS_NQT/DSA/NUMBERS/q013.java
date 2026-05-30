package NUMBERS;
//prime factors of number
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Prime factors of " + n + " are: ");

        // Step 1: Handle factor 2 separately
        if (n % 2 == 0) {
            System.out.print(2 + " ");
            while (n % 2 == 0) {
                n /= 2;
            }
        }

        // Step 2: Check odd factors from 3 onwards
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                System.out.print(i + " ");
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // Step 3: If n is still > 2, it is prime
        if (n > 2) {
            System.out.print(n);
        }
    }
}
