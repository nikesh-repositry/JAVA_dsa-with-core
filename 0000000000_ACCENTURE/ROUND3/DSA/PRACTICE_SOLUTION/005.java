package ARRAYS;
import java.util.*;
// FIND SECOND SMALLEST ELEMENT
public class q5 {
    public static void main(String[] args) {
        int[] arr = {2,3,32,1,3,32,324,43,4,45,4,54,34,35};
        int res = Integer.MAX_VALUE;
        int res2 = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<res && arr[i]<res2){
                res2 = res;
                res = arr[i];
            }else if(arr[i]>res && arr[i]<res2){
                res2 = arr[i];
            }
        }
        System.out.println(res2);
    }
}
