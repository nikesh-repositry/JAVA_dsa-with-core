package SORTING.algos;
public class bubble {
    public static void main(String[] args) {
        int[] arr= {8,4,5,96,7,2,0,16,4,50};
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
