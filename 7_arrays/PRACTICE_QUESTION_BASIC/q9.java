//EASY
//REVERSE ARRAY
package ARRAYS;
import java.util.Arrays;
public class q9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0;i< arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
     // while(start<end){                 using while loop
     //        int temp = arr[start];
     //        arr[start] = arr[end];
     //        arr[end] = temp;
     //        start++;
     //        end--;
}

