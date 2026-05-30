package STRINGS;
//calculate number of digits in string
public class SumNumbersDirect {
    public static void main(String[] args) {
        String str = "1xyz23";   // Example input

        int sum = 0;
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');  // build number
            } else {
                sum += num;  // add accumulated number
                num = 0;     // reset
            }
        }

        sum += num;  // add last number if string ends with digits

        System.out.println("Sum = " + sum);
    }
}
