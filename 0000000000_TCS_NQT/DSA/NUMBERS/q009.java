package NUMBERS;
// the min and max digit from the given number
public class q7 {
    public static void main(String[] args) {
        int n = 9781;
        int max = 0;
        int min = 9;
        while(n>0){
            int t = n%10;
            if(t<min){
                min = t;
            }
            if(t>max){
                max=t;
            }
            n/=10;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
