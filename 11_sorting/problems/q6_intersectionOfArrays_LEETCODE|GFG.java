class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList <Integer> result = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(result.isEmpty() || result.get(result.size()-1)!=nums1[i]){
                    result.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        //int[] array = list.stream().mapToInt(Integer::intValue).toArray();  alternative to convert arraylist to array
        int[] array = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            array[k] = result.get(k);
        }

        return array;
    }
}
/*
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/
