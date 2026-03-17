//two sum by you can using sorting
package SORTING;
import java.util.Arrays;
public class q4 {
    public static int[] ada(int[] arr, int k){
        Arrays.sort(arr);
        int j=arr.length-1,i=0;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==k){
                return new int[]{arr[i],arr[j]};
            }
            else if(sum>k) {
                j--;
            }else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,5,7,8,6};
        int k = 12;
        System.out.println(Arrays.toString(ada(arr,k)));
    }
}
