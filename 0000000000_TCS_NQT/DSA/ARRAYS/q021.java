//remove all the duplicate elements from the unsorted array
package ARRAYS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class q09 {
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
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> brr = new ArrayList<>();
        for(int ele: arr){
            if(!map.containsKey(ele)){
                map.put(ele,true);
                brr.add(ele);
            }
        }
        for(int ele:brr){
            System.out.print(ele);
        }
    }
}
