package STRINGS;
//remove all the unwanted characters
public class q5 {
    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";

        // ✅ Keep only alphabets (A–Z, a–z)
        String result = str.replaceAll("[^a-zA-Z]", "");

        /*
        
[a-zA-Z] → matches all English letters (both lowercase and uppercase).

^ inside the brackets → means NOT these characters.

So [^a-zA-Z] → matches digits, spaces, punctuation, and special symbols.

replaceAll(..., "") → removes those matched characters.
         */
        System.out.println("Original String: " + str);
        System.out.println("Only alphabets: " + result);
    }
}
