public class Problem08_ToggleAndClean {
    public static void main(String[] args) {
        String str = "Hello Java @123!";
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                // Convert lowercase to uppercase using ASCII offset
                sb.append((char) (c - 32));
            } else if (c >= 'A' && c <= 'Z') {
                // Convert uppercase to lowercase using ASCII offset
                sb.append((char) (c + 32));
            } else if (c == ' ') {
                // Keep spaces as they are
                sb.append(c);
            }
            // All other characters (digits, punctuation, symbols) are ignored
        }
        
        System.out.println("Result: " + sb.toString()); 
        // Output: hELLO jAVA 
    }
}
