//remove dublicates from sorted array
package ARRAYS;

import java.util.Scanner;

public class q08 {
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
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
//                i++;
            }
        }
        System.out.println("Array after removing duplicates:");
        for(int k = 0; k <= i; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
