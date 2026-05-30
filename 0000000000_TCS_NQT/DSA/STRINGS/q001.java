//check palindrome
package STRINGS;

public class q1 {
    public static void main(String[] args) {

        String s = "Madam";
//        s = s.toLowerCase().replaceAll("[^a-z0-9]","");    //use when case is insensitive and to ignore numbers, and special characters
        int i =0,j=s.length()-1;
        boolean r = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                r = false;
                break;
            }
            i++;
            j--;
        }
        if(r==true){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
