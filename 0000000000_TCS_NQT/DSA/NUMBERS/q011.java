//power of the number
package NUMBERS;

public class PowerNegative {
    public static void main(String[] args) {
        double x = 2;   // base
        int n = -3;     // exponent (negative)

        double result = 1;

        // If exponent is negative, work with positive exponent
        int exp = Math.abs(n);

        for (int i = 1; i <= exp; i++) {
            result *= x;
        }

        // If original exponent was negative, take reciprocal
        if (n < 0) {
            result = 1.0 / result;
        }

        System.out.println(x + "^" + n + " = " + result);
    }
}
