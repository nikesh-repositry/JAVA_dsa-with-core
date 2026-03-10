//segrerate 0 and 1 but without counting 
class Solution {
    void segregate0and1(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            if((arr[high]==0)&&(arr[low]==1)){
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
                low++;
                high--;
            }
            else if(arr[low]==0){
                low++;
            }
            else{
                high--;
            }
        }
        
    }
}
