//find the second smallest and second largest in the array
package ARRAYS;
import java.sql.SQLOutput;
import java.util.Scanner;
public class q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("enter element no. "+ (i+1));
            arr[i] = sc.nextInt();
        }
        if(n<2){
            System.out.println(-1);
            return;
        }
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){

                second_smallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<second_smallest && arr[i]>smallest){
                second_smallest = arr[i];
            }

            if(arr[i]>largest){

                second_largest = largest;
                largest = arr[i];
            }else if(arr[i]>second_largest && arr[i]<largest){
                second_largest = arr[i];
            }
        }
        if(second_largest == Integer.MIN_VALUE){
            System.out.println("all elements are equal ");
        }else{
            System.out.println("second largest ="+second_largest);
        }
        if(second_smallest == Integer.MAX_VALUE){
            System.out.println("all elements are equal ");
        }else{
            System.out.println("second smallest ="+second_smallest);
        }
    }
}

/*
========================
Edge Case Test Suite
Second Smallest & Second Largest
========================

Case 1: Array size less than 2
Input:
1
5
Output:
-1

------------------------

Case 2: All elements equal
Input:
4
7 7 7 7
Output:
all elements are equal 
all elements are equal 

------------------------

Case 3: Exactly two distinct elements
Input:
2
5 6
Output:
second largest =5
second smallest =6

------------------------

Case 4: Duplicates but at least two distinct values
Input:
5
5 5 6 6 7
Output:
second largest =6
second smallest =6

------------------------

Case 5: Strictly increasing array
Input:
5
1 2 3 4 5
Output:
second largest =4
second smallest =2

------------------------

Case 6: Strictly decreasing array
Input:
5
9 8 7 6 5
Output:
second largest =8
second smallest =6

------------------------

Case 7: Negative numbers
Input:
5
-10 -20 -30 -40 -50
Output:
second largest =-20
second smallest =-40

------------------------

Case 8: Mix of positive and negative
Input:
6
-5 0 10 -2 7 7
Output:
second largest =7
second smallest =-2
*/
