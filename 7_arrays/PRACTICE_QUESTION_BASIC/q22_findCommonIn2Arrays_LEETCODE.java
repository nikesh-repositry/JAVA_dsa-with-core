//find common digit count in both arrays
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] arr1 = new boolean[101];
        boolean[] arr2 = new boolean[101];
        for(int i:nums1){
            arr1[i]=true;
        }
        for(int i:nums2){
            arr2[i]=true;
        }
        int count1=0;
        int count2=0;
        for(int i:nums1){
            if(arr2[i]) count1++;
        }
        for(int i:nums2){
            if(arr1[i]) count2++;
        }
        return new int[]{count1,count2};
    }
}
/*Input: nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]

Output: [3,4]

Explanation:

The elements at indices 1, 2, and 3 in nums1 exist in nums2 as well. So answer1 is 3.

The elements at indices 0, 1, 3, and 4 in nums2 exist in nums1. So answer2 is 4.*/
