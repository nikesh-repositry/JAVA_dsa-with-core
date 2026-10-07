package ARRAYS;
import java.util.*;
//FIND THE SECOND LARGEST
public class q4 {
    public static void main(String[] args) {
        int[] arr = {3,32,6,324,235,3,225,235,135,6};
        int res = Integer.MIN_VALUE;
        int res2 = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>res && arr[i]>res2){
                res2 = res;
                res = arr[i];

            }
            if(arr[i]>res2 && arr[i]<res){
                res2=arr[i];
            }
        }
        if(res2 == Integer.MIN_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(res2);
        }
    }
}
