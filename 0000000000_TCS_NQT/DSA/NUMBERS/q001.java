package NUMBERS;
//check number is palindrome or not
public class q1 {
    public static void main(String[] args) {
        int n= 12251;
        int d = n;
        int r = 0;
        while(n>0){
            int t = n%10;
            r = (r*10)+t;
            n/=10;
        }

        if(d==r){
            System.out.println("number is palindrome");
        }else{
            System.out.println("not ");
        }

    }
}
