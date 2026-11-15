import java.util.HashMap;
import java.util.Map;

public class Problem09_CharFrequency {
    public static void main(String[] args) {
        String str = "banana";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println("Frequencies: " + freq);
    }
}
