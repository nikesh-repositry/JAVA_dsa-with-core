//Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
class Solution {
    public int maximumCount(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int neg_count = 0;
        int pos_count = 0;
        int result = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<0){
                neg_count = mid+1;
                start = mid+1;
            }else{
                end = end-1;
            }
        }
        start = 0;
        end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>0){
                pos_count = arr.length-mid;
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        if(pos_count>neg_count){
            result = pos_count;
        }else{
            result = neg_count;
        }
        return result;
    }
}
/*Input: nums = [-3,-2,-1,0,0,1,2]
Output: 3
Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.*/









