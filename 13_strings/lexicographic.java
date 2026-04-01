package STRINGS;
import java.util.*;
public class lexographic {
    // Manual implementation of lexicographic comparison
    // Works like compareTo(): compares character by character until mismatch or end.
    public static int manualCompare(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                // Return difference in ASCII values of first mismatched characters
                return a.charAt(i) - b.charAt(i);
            }
        }
        // If all matched till min length, longer string is considered "greater"
        return a.length() - b.length();
    }

    public static void main(String[] args) {
        // 1. Basic compareTo()
        String a = "apple";
        String b = "banana";
        // Compares lexicographically: 'a' vs 'b' → 'a' < 'b'
        System.out.println("Basic compareTo: " + a.compareTo(b)); // Negative //Basic compareTo: -1

        // 2. Equal Strings
        // Both strings identical → returns 0
        System.out.println("Equal strings: " + "hello".compareTo("hello")); // 0

        // 3. Case Sensitivity
        // ASCII value of 'A' (65) is less than 'a' (97)
        System.out.println("Case sensitivity: " + "Apple".compareTo("apple")); // Negative -32

        // 4. compareToIgnoreCase()
        // Ignores case differences → treats 'A' and 'a' as equal
        System.out.println("Ignore case: " + "Apple".compareToIgnoreCase("apple")); // 0 

        // 5. Sorting Strings
        // Collections.sort uses compareTo internally to order strings lexicographically
        List<String> list = Arrays.asList("banana", "apple", "cherry");
        Collections.sort(list);
        System.out.println("Sorted list: " + list); // [apple, banana, cherry]

        // 6. Custom Comparator (reverse order)
        // Comparator flips the comparison → sorts in descending order
        List<String> list2 = Arrays.asList("banana", "apple", "cherry");
        Collections.sort(list2, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Reverse sorted list: " + list2); // [cherry, banana, apple]

        // 7. Comparing Prefixes
        // "harsh" is prefix of "harshit". Longer string is considered greater.
        System.out.println("Prefix compare: " + "harshit".compareTo("harsh")); // Positive 2

        // 8. Manual Lexicographic Comparison
        // Demonstrates how compareTo works internally
        System.out.println("Manual compare (harshit vs harsh): " + manualCompare("harshit", "harsh")); //2
        System.out.println("Manual compare (apple vs banana): " + manualCompare("apple", "banana")); //-1

        // 9. Numeric Strings
        // Lexicographic, not numeric: '1' (ASCII 49) < '4' (ASCII 52)
        System.out.println("Numeric strings: " + "123".compareTo("45")); // Negative -3

        // 10. Mixed Examples
        // Equal strings → 0
        System.out.println("dog vs dog: " + "dog".compareTo("dog"));   // 0
        // 'd' (100) vs 'c' (99) → positive
        System.out.println("dog vs cat: " + "dog".compareTo("cat"));   // Positive 1
        // 'd' (100) vs 'z' (122) → negative
        System.out.println("dog vs zebra: " + "dog".compareTo("zebra")); // Negative -22
    }
}
