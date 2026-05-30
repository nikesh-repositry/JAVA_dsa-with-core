package STRINGS;
//sort char in the string
import java.util.Arrays;

public class SortCharacters {
    public static void main(String[] args) {
        String str = "zxcbg";   // Example input

        // Convert to char array
        char[] arr = str.toCharArray();

        // Sort the array
        Arrays.sort(arr);

        // Build sorted string
        String result = new String(arr);

        System.out.println("Sorted string: " + result);
    }
}
