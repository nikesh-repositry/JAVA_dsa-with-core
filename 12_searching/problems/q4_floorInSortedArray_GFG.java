/*Given a sorted array arr[] and an integer x, 
find the index (0-based) of the largest element in arr[] that is less than or equal to x. 
This element is called the floor of x. If such an element does not exist, return -1.
Note: In case of multiple occurrences of floor of x, return the index of the last occurrence. */

class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int start = 0;
        int end = arr.length;
        int result = -1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]==x || arr[mid]<x){
                start=mid+1;
                result = mid;
            }else{
                end = mid;
            }
        }
        return result;
    }
}
/*
Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 11
Output: 4
Explanation: Largest Number less than or equal to 11 is 10, whose indices are 3 and 4. The index of last occurrence is 4.
*/
