package NUMBERS;
// find all prime numbers in a given range

import java.util.ArrayList;
import java.util.List;

public class q4 {
    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Find all primes in range [min, max]
    public static List<Integer> primesInRange(int min, int max) {
        List<Integer> primes = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 16;

        List<Integer> primes = primesInRange(a, b);
        System.out.println("Prime numbers between " + a + " and " + b + ": " + primes);
    }
}
