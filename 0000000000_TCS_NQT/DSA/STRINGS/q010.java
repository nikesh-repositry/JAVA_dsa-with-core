//find non repeating char
package STRINGS;

public class NonRepeatingEasy {
    public static void main(String[] args) {
        String str = "google";   // Example input

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Count occurrences of ch
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // Print if non-repeating
            if (count == 1) {
                System.out.print(ch + " ");
            }
        }
    }
}
