package NUMBERS;
//check prime or not
public class q3 {
    public static void main(String[] args) {
        int n = 13;

        if (n <= 1) {
            System.out.println("not prime");
        } else if (n == 2) {
            System.out.println("prime");
        } else if (n % 2 == 0) {
            System.out.println("not prime");
        } else {
            boolean composite = false;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    composite = true;
                    break; // stop as soon as a divisor is found
                }
            }
            if (composite) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }
        }
    }
}
