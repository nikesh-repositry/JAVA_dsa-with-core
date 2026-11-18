// Problem: Return a list containing the first N numbers of the Fibonacci sequence.

import java.util.*;

class Solution7 {
    public List<Integer> fibonacciSeries(int n) {
        // Logic: Start with 0 and 1. Each next number is the sum of the previous two numbers.
        List<Integer> series = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            series.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return series;
    }

    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        int n = 7; // Input
        List<Integer> result = sol.fibonacciSeries(n);
        System.out.println(result);
        // Output: [0, 1, 1, 2, 3, 5, 8]
    }
}
