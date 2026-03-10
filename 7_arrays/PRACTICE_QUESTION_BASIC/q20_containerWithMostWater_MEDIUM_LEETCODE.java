//HARD
//https://leetcode.com/problems/container-with-most-water/description/
class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int max_water = 0;
        while(i<j){
            if(arr[i]<arr[j]){
                int a = arr[i]*(j-i);
                if(a>max_water){
                    max_water=a;
                }
                i++;
            }
            else if(arr[i]>arr[j]){
                int b = arr[j]*(j-i);
                if(b>max_water){
                    max_water=b;
                }
                j--;
            }
            else if(arr[i]==arr[j]){
                int c= arr[i]*(j-i);
                if(c>max_water){
                    max_water=c;
                }
                i++;
            }
        }return max_water;
    }
}
