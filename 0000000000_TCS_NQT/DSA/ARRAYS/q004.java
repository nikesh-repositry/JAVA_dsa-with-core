// implement 3 sum leetcode 15
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>>result=new ArrayList<>();
        if(nums.length==0||nums.length<3){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }

            int b =i+1;
            int c =nums.length-1;
            while(b<c){
                int sum = nums[i]+nums[b]+nums[c];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[b],nums[c]));
                    // b++;
                    // c--;
                    while(b<c && nums[b]==nums[b+1]) b++;
                    while(c>b && nums[c]==nums[c-1]) c--;
                    b++;
                    c--;
                }else if(sum>0){
                    c--;
                }else{
                    b++;
                }
            }
        }
        return result;
                
    }
}
