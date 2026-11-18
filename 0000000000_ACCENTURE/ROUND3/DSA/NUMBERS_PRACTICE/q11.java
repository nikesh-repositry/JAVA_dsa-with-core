// Problem: Find the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two integers.

import java.util.*;

class Solution11 {
    public int[] findGcdAndLcm(int a, int b) {
        // Logic: Use Euclidean Algorithm for GCD: repeatedly replace (a, b) with (b, a % b) until b is 0.
        // Use the formula: LCM(a, b) = (a * b) / GCD(a, b).
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;
        return new int[]{gcd, lcm};
    }

    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        int a = 12, b = 18; // Input
        int[] result = sol.findGcdAndLcm(a, b);
        System.out.println("GCD: " + result[0] + ", LCM: " + result[1]);
        // Output: GCD: 6, LCM: 36
    }
}
