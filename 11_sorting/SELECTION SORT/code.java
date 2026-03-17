//SELECTION SORT
package SORTING.algos;
public class selection {
    public static void main(String[] args) {
        int[] arr = {25,8,1265,6,596,6,322,66,9};
        for(int i=0;i<arr.length-1;i++){       //helps to divide the sorted and unsorted array
            int cam = i;                       //here keep the index of smallest digit in the unsorted array
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[cam]){           //update index every time if new smallest digit is found in unsorted array
                    cam=j;
                }
            }
            if (cam != i) {         //not necessary but if cam does not change after the inner iteration then no need to execute the swap logic
                int temp = arr[cam]; //swap the first index of unsorted array with smallest digit
                arr[cam] = arr[i];
                arr[i] = temp;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
