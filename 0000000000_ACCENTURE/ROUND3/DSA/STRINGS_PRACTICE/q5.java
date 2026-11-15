public class Problem05_CountWords {
    public static void main(String[] args) {
        String sentence = "  Java is   fun to learn  ";
        String trimmed = sentence.trim();
        int count = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
        System.out.println("Word count: " + count);
    }
}


/*
The magic is in the + symbol inside "\\s+":
• \\s matches a single whitespace character (a space, tab, or newline).
• + means "one or more in a row."
Because of that +, Java groups all consecutive spaces together and treats 
them as one single divider. Whether there is 1 space or 10 spaces between two words, 
split("\\s+") slices right through the whole gap at once and only gives you the actual words.
*/
