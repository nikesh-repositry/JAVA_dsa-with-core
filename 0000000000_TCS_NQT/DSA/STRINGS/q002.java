package STRINGS;
//count vowel, consonents and space 
public class q2 {
    public static void main(String[] args) {
        String s = "I am only a human";
        s=s.toLowerCase();
        int v =0,c=0,p=0;
        for(int i=0;i<s.length();i++){
            char n = s.charAt(i);
            if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
                v++;
            }else if(n>='a' && n<='z'){
                c++;
            }else if(n==' '){
                p++;
            }
        }
        System.out.println(v);
        System.out.println(c);
        System.out.println(p);
    }
}
