package STRINGS;
//count words
public class CountWordsSpaces {
    public static void main(String[] args) {
        String s = "Hello this is test";

        int spaces = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
        }

        // Number of words = spaces + 1
        int wordCount = spaces + 1;

        System.out.println("Number of words: " + wordCount);
    }
}
