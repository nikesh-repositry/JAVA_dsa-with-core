public class Problem01_ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed: " + new String(chars));
    }
}
//using stringbuilder
public class StringReverseExample {
    public static void main(String[] args) {
        String original = "Java Programming";
        
        // 1. Convert the original String into a StringBuilder object
        StringBuilder sb = new StringBuilder(original);
        
        // 2. Use the built-in reverse() method to invert the characters in-place
        sb.reverse();
        
        // 3. Convert it back to a standard String object
        String reversed = sb.toString();
        
        // Output the results
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
