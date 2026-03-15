
//check if the array is sorted and rotated 
class Solution {
    public void rev(int[] arr,int a,int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        } 
    }
    public boolean check(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                rev(nums,0,i);
                rev(nums,i+1,nums.length-1);
                rev(nums,0,nums.length-1);
                for(int j=0;j<nums.length-1;j++){
                    if(nums[j]>nums[j+1]){
                        return false;
                    }
                }return true;
            }
        }

        return true;
    }
}
/*
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2]. */

//OTHER WAY
/*
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Check if the current element is greater than the next element
            // We use (i + 1) % n to connect the last element back to the first
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            
            // If there's more than one "drop", it can't be a rotated sorted array
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
} */
