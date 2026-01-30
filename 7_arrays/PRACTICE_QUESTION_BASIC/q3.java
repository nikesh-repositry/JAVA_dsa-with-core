//BASIC
//PRINT THE MAXIMUM ELEMENT IN THE ARRAY
package ARRAYS;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,5,4,8,7,55,645961,0};
        int max= Integer.MIN_VALUE;  //standard commonly used in java for minimum value
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max is "+max);  //max is 645961
        int maxi =arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
//            else{
//                maxi=arr[i+1];
//            }
        }
        System.out.println("maximum is "+maxi);
    }
}
