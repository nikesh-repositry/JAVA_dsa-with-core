// Problem Statement: Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
//print frequency of all elements
package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;

public class q05 {
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

        Arrays.sort(arr); // Step 1: sort ascending

        // Step 2: reverse the second half
        int mid = n / 2;
        int i = mid, j = n - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Print final result
        System.out.println("Rearranged array:");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
