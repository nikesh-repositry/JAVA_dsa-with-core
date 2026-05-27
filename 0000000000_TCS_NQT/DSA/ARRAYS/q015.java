//reverse the given array with inspace
package ARRAYS;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("enter element no. "+ (i+1));
            arr[i] = sc.nextInt();
        }

        int i=0;
        while(i < n/2){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
            i++;
            n--;
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
/*
========================
Reverse Array Test Suite
========================

Case 1: Empty array
Input:
0
Output:
(no output)

------------------------

Case 2: Single element
Input:
1
7
Output:
7

------------------------

Case 3: Two elements
Input:
2
5 6
Output:
6
5

------------------------

Case 4: Odd number of elements
Input:
5
1 2 3 4 5
Output:
5
4
3
2
1

------------------------

Case 5: Even number of elements
Input:
4
10 20 30 40
Output:
40
30
20
10

------------------------

Case 6: Negative numbers
Input:
5
-1 -2 -3 -4 -5
Output:
-5
-4
-3
-2
-1

------------------------

Case 7: Mixed values
Input:
6
100 -50 0 25 -75 200
Output:
200
-75
25
0
-50
100

------------------------

Case 8: Duplicates
Input:
6
1 2 2 3 3 4
Output:
4
3
3
2
2
1
*/
