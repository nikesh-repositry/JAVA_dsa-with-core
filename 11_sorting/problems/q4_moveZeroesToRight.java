//move all zeroes using bubble sort
package SORTING;
public class q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,4,0,5,0,5,0,0,6,0};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
