/*2461. Maximum Sum of Distinct Subarrays With Length K
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

The length of the subarray is k, and
All the elements of the subarray are distinct.
Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.

A subarray is a contiguous non-empty sequence of elements within an array.*/

class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        if(arr.length<k|| arr ==null||k==0){
            return 0;
        }
        long maxsum =0;
        long currsum =0;
        int l=0;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int r=0;r<arr.length;r++){
            currsum+=arr[r];
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);

            if(r-l+1 > k){
                currsum-=arr[l];
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            if(r-l+1 == k  &&  map.size() == k){
                maxsum = Math.max(maxsum,currsum);
            }
        }
        return maxsum;
    }
}
