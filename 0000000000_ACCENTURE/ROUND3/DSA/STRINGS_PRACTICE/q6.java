public class Problem06_LengthWithoutMethod {
    public static void main(String[] args) {
        String str = "abcdef";
        int length = 0;

        for (char c : str.toCharArray()) {
            length++;
        }
        System.out.println("Length: " + length);
    }
}
