//BASIC
//PRINT THE MINIMUM ELEMENT OF ARRAY
package ARRAYS;
//import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        int[] arr={1,0,565,65,-61};
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
