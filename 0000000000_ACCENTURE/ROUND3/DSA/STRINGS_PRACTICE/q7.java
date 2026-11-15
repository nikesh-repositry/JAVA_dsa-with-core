public class Problem07_RemoveSpaces {
    public static void main(String[] args) {
        String str = "H e l l o   W o r l d";
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        System.out.println("Without spaces: " + sb.toString());
    }
}
