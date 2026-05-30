package NUMBERS;
// Input Format: N = 76
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.
// import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calculate square
        int square = n * n;

        // Convert both to string
        String numStr = String.valueOf(n);
        String squareStr = String.valueOf(square);

        // Check if square ends with the number
        if (squareStr.endsWith(numStr)) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}
