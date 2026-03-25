//find the first and last occurance of element present in a sorted array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int r1=nums.length-1,r2=nums.length-1,l1=0,l2=0;
        int o1 = -1, o2 = -1;
        while(l1<=r1){
            int mid = l1+(r1-l1)/2;
            if(nums[mid]==target){
                o1=mid;
                r1 = mid-1;
            }
            else if(nums[mid]>target){
                r1=mid-1;
            }else{
                l1=mid+1;
            }
        }
        while(l2<=r2){
            int mid = l2+(r2-l2)/2;
            if(nums[mid]==target){
                o2=mid;
                l2 = mid+1;
            }
            else if(nums[mid]>target){
                r2=mid-1;
            }else{
                l2=mid+1;
            }
        }
        return new int[]{o1,o2};
    }
}
/*
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]*/






