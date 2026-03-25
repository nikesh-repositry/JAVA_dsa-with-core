package SEARCHING;

public class binarySearch {
    public static int search(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2; //more safer than start+end/2 because of overflow 
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]>k){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,25,48,55,963,875,452126,99999999};
        int target = 452126;
        System.out.println(search(arr,target));
    }
}
