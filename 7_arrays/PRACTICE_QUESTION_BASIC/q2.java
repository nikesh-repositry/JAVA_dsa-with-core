//BASIC
//PRINT SUM OF ELEMENTS OF THE ARRAY
package ARRAYS;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the size of array: ");
        int size= sc.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<arr.length;i++){
            System.out.print("enter digit at index "+i+": ");
            arr[i] = sc.nextInt();
        };
        int sum =0;
        for(int i =0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum of elements of the array is "+sum);
    }
}
