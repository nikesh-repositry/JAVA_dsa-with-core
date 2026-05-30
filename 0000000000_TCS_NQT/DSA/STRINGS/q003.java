package STRINGS;
//find ascii code of char and string
public class q3 {
    public static void main(String[] args) {
        char c = 'e';
        int as = (int)c;
        System.out.println(as);

        String s = "hellow234";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int asi = (int)ch;
            System.out.println(asi);
        }
    }
}
