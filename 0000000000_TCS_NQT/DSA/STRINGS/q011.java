package STRINGS;
//anagram
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "ACT";

        // Convert to lowercase for case-insensitive comparison
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // If lengths differ → not an anagram
        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }

        // Convert to char arrays
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare sorted arrays
        if (Arrays.equals(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
