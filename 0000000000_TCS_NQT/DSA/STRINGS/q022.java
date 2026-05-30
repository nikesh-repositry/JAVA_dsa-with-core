//reverse words in string
package STRINGS;

import java.util.Scanner;

public class ReverseWordsSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String[] words = new String[s.length()];
        int count = 0;
        StringBuilder current = new StringBuilder();

        // Split words manually (no trim, no regex)
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                current.append(c);
            } else {
                if (current.length() > 0) {
                    words[count++] = current.toString();
                    current.setLength(0);
                }
            }
        }
        // Add last word if exists
        if (current.length() > 0) {
            words[count++] = current.toString();
        }

        // Reverse and print
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) System.out.print(" ");
        }
    }
}

