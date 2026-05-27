/*
========================
Median in Array
========================

Definition:
The median is the middle value of a sorted array. 
It divides the dataset into two equal halves.

Steps:
1. Sort the array in ascending order.
2. Find the middle position(s).

Case 1: Odd number of elements (n is odd)
Median = element at position (n/2)   [0-based index]
Example:
Array = [1, 3, 5]
Sorted = [1, 3, 5]
n = 3 → median = arr[3/2] = arr[1] = 3

Case 2: Even number of elements (n is even)
Median = (element at position (n/2 - 1) + element at position (n/2)) / 2
Example:
Array = [1, 2, 3, 4]
Sorted = [1, 2, 3, 4]
n = 4 → median = (arr[1] + arr[2]) / 2 = (2 + 3)/2 = 2.5

Formula Summary:
If n is odd:
    Median = arr[n/2]
If n is even:
    Median = (arr[(n/2)-1] + arr[n/2]) / 2

      */



//median of array
package ARRAYS;
import java.util.*;

public class q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter element no. " + (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println();
        Arrays.sort(arr);
        double median =0;
        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }
        if(n%2==0){
            median = (arr[(n/2)]+arr[(n/2-1)])/2.0;
        }else{
            median = arr[(n/2)];
        }
        System.out.println(median);
    }
}
