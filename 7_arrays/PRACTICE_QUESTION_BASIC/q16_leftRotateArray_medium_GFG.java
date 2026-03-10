/*MEDIUM
LEFT ROTATE THE ARRAY BY K
 */
package ARRAYS;
import java.util.Arrays;
public class q1_leftRotate_GFG {
    static void reverse(int[] arr, int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotate(int[] arr,int d){
        int n = arr.length;
        d=d%n;
        System.out.println(d);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int d = 2;
        rotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}

/* THE TRICK IS
REVERSE THE FIRST PART FROM START TO K-1
REVERSE THE SECOND PART FROM K TO END
REVERSE THE WHOLE ARRAY AT LAST

 */
