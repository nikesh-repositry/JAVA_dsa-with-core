package STRINGS;
//replace all the vowels
public class q4 {
    public static void main(String[] args) {
        String s = "NikeSH";
        String result = s.replaceAll("[AEIOUaeiou]","");
        System.out.println(result);
    }
}
