//print the number of vowels in the string
package STRINGS;
public class q1 {
    public static void main(String[] args) {
        String str = "hbaspiosahaljboabnknwokjsndlkapiahoubo";
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
