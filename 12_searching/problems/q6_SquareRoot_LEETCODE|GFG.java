//find sqare root of integer
class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        if(x==0) return 0;
        int start = 1;
        int end = x;
        int result = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid==x/mid){
                return mid;
            }else if(mid>x/mid){
                end=mid-1;
            }else{
                result = mid;
                start = mid+1;
            }
        }
        return result;
        
    }
}
