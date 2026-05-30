package STRINGS;
//Change every letter with next lexicographic alphabet




//Problem Statement: Given a string, write a program to change every letter in the given string with the letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a) .
public class NextAlphabet {
    public static void main(String[] args) {
        String str = "abcdxyz";   // Example input
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                // Handle wrap-around for 'z' and 'Z'
                if (ch == 'z') {
                    result.append('a');
                } else if (ch == 'Z') {
                    result.append('A');
                } else {
                    result.append((char)(ch + 1));
                }
            } else {
                // Non-letters remain unchanged
                result.append(ch);
            }
        }

        System.out.println("Result: " + result.toString());
    }
}
