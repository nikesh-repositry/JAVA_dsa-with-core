//reverse selection sort 
package SORTING;
public class q3 {
    public static void main(String[] args) {
        int[] arr = {5,2,8,2,6,2,620,6,0,62};
        for(int i=0;i< arr.length-1;i++){
            int max = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            if(max!=i){
                int temp = arr[max];
                arr[max] = arr[i];
                arr[i] = temp;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
