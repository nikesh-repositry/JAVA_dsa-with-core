//implement binary search in reverse sorted array
package SEARCHING;
public class q2 {
    public static void main(String[] args) {
        int[] arr = {666,58,36,29,21,15,3,0};
        int tar = 21;
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==tar) {
                result = mid;
                break;
            }else if(arr[mid]>tar){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        System.out.println(result);
    }
}
