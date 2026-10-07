package ARRAYS;
//IMPLEMENT BINARY SEARCH
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,23,4,99,2,34,21,44,21};
        Arrays.sort(arr);
        int key = 5;
        int ans = Arrays.binarySearch(arr,key);
        System.out.println(ans);

        //no built in method
        int i=0,j= arr.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]>key){
                j=mid+1;
            }else if(arr[mid]<key){
                i=mid-1;
            }else{
                System.out.println("found");
                break;
            }
        }
    }

}
