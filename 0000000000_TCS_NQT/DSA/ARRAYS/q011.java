/*
209. Minimum Size Subarray Sum
Solved
Medium
Topics
premium lock icon
Companies
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint. */

class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        if(arr == null || arr.length==0){
            return 0;
        }
        int sum =0;
        int l =0;
        int len = Integer.MAX_VALUE;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            while(sum>=target){
                len = Math.min(len,r-l+1);
                sum-=arr[l];
                l++;
            }

        }
        if(len==Integer.MAX_VALUE) return 0;
        return len;
        
    }
}
