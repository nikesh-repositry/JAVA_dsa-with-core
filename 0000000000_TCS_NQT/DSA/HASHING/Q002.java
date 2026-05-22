//RANSOMNOTE PROBLEM
/*
Given two strings ransomNote and magazine, return true if ransomNote can be 
constructed by using the letters from magazine and false otherwise.
An empty ransom note can always be constructed, even from an empty magazine.
 an empty ransom note requires nothing, so it’s always possible.
  */
package HASHING;
import java.util.HashMap;
public class Q002 {
    public static boolean check(String r, String m){

        if(r==null || m==null || r.length()>m.length()){
            return false;
        }

        HashMap<Character, Integer> mag = new HashMap<>();
        for(int i =0; i<m.length();i++){
            char ch = m.charAt(i);
            mag.put(ch,mag.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<r.length();i++){
            char ch = r.charAt(i);
            int current = mag.getOrDefault(ch,0);
            if(current == 0){
                return false;
            }
            mag.put(ch,current-1);
        }

        return true;
    }
    public static void main(String[] args){
        String r = "a";
        String m = "";
        System.out.println(check(r,m));
    }
}
