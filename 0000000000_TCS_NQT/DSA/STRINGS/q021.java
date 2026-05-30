//find position of substrin
package STRINGS;

import java.util.Scanner;

public class SubstringPositionScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter main string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter substring: ");
        String str2 = sc.nextLine();

        // Edge cases
        if (str1 == null || str1.isEmpty()) {
            System.out.println("Main string is empty → -1");
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            System.out.println("Substring is empty → -1");
            return;
        }
        if (str2.length() > str1.length()) {
            System.out.println("Substring longer than main string → -1");
            return;
        }

        // Find position
        int index = str1.indexOf(str2);

        System.out.println("Position: " + index);
    }
}
