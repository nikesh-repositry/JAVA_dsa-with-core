//BASIC
//PRINT ONLY THE NEGATIVE DIGITS FROM THE ARRAY
package ARRAYS;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the number of index " + i);
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("negative number is "+arr[i]+" at index "+i);
            }
        }
    }
}

