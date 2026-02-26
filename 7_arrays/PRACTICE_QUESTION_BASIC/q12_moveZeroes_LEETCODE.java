//EASY
//MOVE ZEROES
//move all zeroes to the right and all non zeroes to left with relative position
package ARRAYS;
import java.util.Arrays;
public class q14 {
    public static void main(String[] args) {
        int[] arr = {0,10,2,0,0,3,-1,0,-351,22,0,22};
        int count = 0;
        int start = 0;
        int end = arr.length;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        for(int i=0;i<(arr.length-count);i++){
            arr[arr.length-i-1]=0;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
/*
first move all the non zeroes to the left
then fill all left right empty spaces with zeroes 
 */
