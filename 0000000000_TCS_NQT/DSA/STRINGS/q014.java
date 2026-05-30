package STRINGS;
//remove duplicates
public class RemoveDuplicatesSimple {
    public static void main(String[] args) {
        String str = "cbacdcbc";   // Example input
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Add character only if not already in result
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}
