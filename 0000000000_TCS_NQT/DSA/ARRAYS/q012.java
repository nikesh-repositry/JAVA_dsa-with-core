//find the smallest number in an array
package ARRAYS;
import java.util.Scanner;
public class q01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(smallest);
    }
}
