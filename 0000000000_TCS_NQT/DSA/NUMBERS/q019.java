package NUMBERS;
// Permutations in which N people can occupy R seats
// // Problem Statement: Find permutations in which n people can occupy r seats in a classroom.
// Input: N = 5, r = 3
// Output: 60
// Explanation: To find permutations of n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! is 60.
// import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter N (people): ");
        int n = sc.nextInt();

        System.out.print("Enter R (seats): ");
        int r = sc.nextInt();

        // Calculate n! / (n-r)!
        int result = 1;
        for (int i = n; i > n - r; i--) {
            result *= i;
        }

        System.out.println("Permutations = " + result);
    }
}
