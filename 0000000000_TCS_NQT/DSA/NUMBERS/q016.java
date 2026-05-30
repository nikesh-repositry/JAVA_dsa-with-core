package NUMBERS;
//greatest common factor
//nput: N1 = 9, N2 = 12 → Output: 3
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        // Euclidean Algorithm
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        System.out.println("GCD = " + n1);
    }
}
