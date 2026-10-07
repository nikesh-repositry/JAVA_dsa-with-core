package ARRAYS;
import java.util.*;
//FIND THE LARGEST NUMBER
public class q2 {
    public static void main(String[] args) {
        int[] arr ={2,4,45,3,66,92,0,38};
        int res = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>res){
                res = arr[i];

            }
        }
        System.out.println(res);
    }
}
