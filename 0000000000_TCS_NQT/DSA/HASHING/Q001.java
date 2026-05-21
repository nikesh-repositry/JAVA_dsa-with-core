//find the first non repeating character return its index or -1
package HASHING;
import java.util.HashMap;
public class Q001 {
    public static int unique(String s){
        if(s==null || s.length() == 0){
            return -1;
        }
        HashMap<Character,Integer> alpha = new HashMap<>();

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            alpha.put(ch, alpha.getOrDefault(ch,0)+1);

        }
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(alpha.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String s ="abca";
        System.out.println(unique(s));
    }
}
