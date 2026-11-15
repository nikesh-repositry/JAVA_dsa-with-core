public class Problem02_Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
