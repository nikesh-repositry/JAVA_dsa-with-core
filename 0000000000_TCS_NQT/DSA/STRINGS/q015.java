package STRINGS;
//print dublicates
import java.util.HashMap;

public class PrintDuplicates {
    public static void main(String[] args) {
        String str = "sinstriiintng";   // Example input

        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Print only duplicates
        System.out.print("Duplicates: [");
        boolean first = true;
        for (char ch : freq.keySet()) {
            int count = freq.get(ch);
            if (count > 1) {
                if (!first) System.out.print(", ");
                System.out.print(ch + ": " + count);
                first = false;
            }
        }
        System.out.println("]");
    }
}
