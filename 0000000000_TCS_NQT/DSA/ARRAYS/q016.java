//count number of occurance of each digits 
package HASHING;
import java.util.*;
public class Q003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        TreeMap<Integer,Integer> map = new TreeMap<>(); //use this when you want solution in ascending order

//        HashMap<Integer,Integer> map = new HashMap<>(); //other wise use this
        for(int i =0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(var i :map.entrySet()){
            System.out.println(i.getKey()+" occurs "+i.getValue());
        }
    }
}

/*
========================
Frequency Counter Test Suite
(TreeMap version - sorted output)
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
7 occurs 1

------------------------

Case 3: All elements equal
Input:
5
9 9 9 9 9
Output:
9 occurs 5

------------------------

Case 4: All distinct elements
Input:
5
1 2 3 4 5
Output:
1 occurs 1
2 occurs 1
3 occurs 1
4 occurs 1
5 occurs 1

------------------------

Case 5: Mixed duplicates
Input:
10
1 2 2 3 3 3 4 4 4 4
Output:
1 occurs 1
2 occurs 2
3 occurs 3
4 occurs 4

------------------------

Case 6: Negative numbers
Input:
5
-1 -2 -1 -2 -3
Output:
-3 occurs 1
-2 occurs 2
-1 occurs 2

------------------------

Case 7: Zero included
Input:
4
0 0 1 2
Output:
0 occurs 2
1 occurs 1
2 occurs 1

------------------------

Case 8: Mixed values
Input:
6
100 -50 0 25 -75 200
Output:
-75 occurs 1
-50 occurs 1
0 occurs 1
25 occurs 1
100 occurs 1
200 occurs 1

------------------------

Case 9: Large duplicates
Input:
8
5 5 5 5 5 5 5 5
Output:
5 occurs 8
*/
