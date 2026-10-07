package ARRAYS;
import java.util.*;
//FIND THE SMALLEST NUMBER
public class q3 {
    public static void main(String[] args) {
        int[] arr ={2,4,45,3,66,92,0,38};
        int res = Integer.MAX_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]<res){
                res = arr[i];

            }
        }
        System.out.println(res);

        Arrays.sort(arr);   //method two but less optimized than above o(nlonn)
        System.out.println(arr[0]);
    }
}
