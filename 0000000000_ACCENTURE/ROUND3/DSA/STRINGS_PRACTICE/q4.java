public class Problem04_UpperLowerCount {
    public static void main(String[] args) {
        String str = "Java Programming 101";
        int upper = 0, lower = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') upper++;
            else if (c >= 'a' && c <= 'z') lower++;
        }
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower);
    }
}
