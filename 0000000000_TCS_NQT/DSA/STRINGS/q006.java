package STRINGS;
//reverse string
public class q6 {
    public static void main(String[] args) {
        // // Convert the string into a character array
        //        char[] arr = str.toCharArray();
        String str = "Hello World";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);

        /*
        String str = "Hello World";

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
         */
    }
}
