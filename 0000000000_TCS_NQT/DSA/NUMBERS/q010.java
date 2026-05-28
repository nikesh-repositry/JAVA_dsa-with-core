package NUMBERS;
// fibonnaci series
public class q8 {
    public static void main(String[] args) {
        int n = 13;
        int a = 0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a +" ");
            int next = a+b;
            a = b;
            b = next;
        }
    }
}
/*
If you want Fibonacci numbers up to a maximum value instead of fixed terms, you can change the loop to:

while (a <= n) {
    System.out.print(a + " ");
    int next = a + b;
    a = b;
    b = next;
}
 */
