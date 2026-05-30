//change case
package STRINGS;

public class ChangeCase {
    public static void main(String[] args) {
        String str = "take u forward IS Awesome";   // Example input
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch); // keep spaces/punctuation unchanged
            }
        }

        System.out.println("Result: " + result.toString());
    }
}
