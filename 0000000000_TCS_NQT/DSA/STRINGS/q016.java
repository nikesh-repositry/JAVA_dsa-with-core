package STRINGS;
//removveRemove Characters from first String present in the Second String




//Problem Statement: Given two strings, write a program to remove characters from the first string which are present in the second string
public class RemoveCharsFromFirst {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cefz";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            // If character not in str2, keep it
            if (str2.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        System.out.println("Result: " + result.toString());
    }
}
