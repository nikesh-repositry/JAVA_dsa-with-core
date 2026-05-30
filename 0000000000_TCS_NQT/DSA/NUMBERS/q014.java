//strong number
package NUMBERS;
 // 1! + 4! + 5! = 145. Hence 145 is a strong number. 

import java.util.Scanner;

public class StrongNumberEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        // Check each digit
        while (temp > 0) {
            int digit = temp % 10;

            // factorial of digit (inline, no method)
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        // Compare with original number
        if (sum == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
