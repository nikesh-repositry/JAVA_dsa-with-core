//easy
//do bubble sort in reverse order means arrange array descending order
package SORTING;
public class q1 {
    public static void main(String[] args) {
        int[] arr = {65,1,561,6510,0,54,0,9};
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
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
