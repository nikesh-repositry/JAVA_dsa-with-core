// find the largest element in the array
package ARRAYS;
import java.util.Scanner;
public class q02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("enter element no. "+ (i+1));
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.print("given array =");
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        System.out.println("largest element is "+ largest);
    }
}

