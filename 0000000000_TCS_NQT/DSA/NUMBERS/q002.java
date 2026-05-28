package NUMBERS;
//Find all Palindrome Numbers in a given range 
public class q2 {
    public static boolean rev(int n){
        int d = n;
        int r = 0;
        while(n>0){
            int t = n%10;
            r = (r*10)+t;
            n/=10;
        }
        return d==r;
    }
    public static void ph(int min,int max){
        for(int i=min;i<=max;i++){

            if(rev(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int min = 100;
        int max = 200;
        System.out.println("here is the palindromes between given min and max");
        ph(min,max);

    }
}
