// implement 3sum closest leetcode 16
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3||nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(k>j){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }    
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
                if (sum < target) {
                    j++;  
                } else {
                    k--;  
                }        
            }
        }
        return result;
    }
}
