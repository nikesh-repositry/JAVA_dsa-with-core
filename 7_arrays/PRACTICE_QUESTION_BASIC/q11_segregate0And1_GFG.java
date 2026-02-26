//EAST
//SEGREGATE 0s AND 1s
//actually like put all 0 left side and all 1 to right side
package ARRAYS;
import java.util.Arrays;
public class q13 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 0, 0};
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
        for (int j = 0; j < zeros; j++) {
            arr[j] = 0;
        }
        for (int j = zeros; j < arr.length; j++) {
            arr[j] = 1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
/*
count only zeroes
then fill the array with 0 until zeroes count ends
then after fill the rest with 1
 */
