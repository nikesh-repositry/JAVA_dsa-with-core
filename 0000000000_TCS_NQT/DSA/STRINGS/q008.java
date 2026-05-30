//capitalize first and last char
package STRINGS;

public class CapitalizeFirstLast {
    public static void main(String[] args) {
        String str = "take u forward is awesome";

        String[] words = str.split(" ");  // split by spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() == 1) {
                // Single-letter word → capitalize it
                result.append(Character.toUpperCase(word.charAt(0)));
            } else {
                // First letter uppercase
                char first = Character.toUpperCase(word.charAt(0));
                // Middle part unchanged
                String middle = word.substring(1, word.length() - 1);
                // Last letter uppercase
                char last = Character.toUpperCase(word.charAt(word.length() - 1));

                result.append(first).append(middle).append(last);
            }
            result.append(" "); // add space after each word
        }

        System.out.println(result.toString().trim());
    }
}
