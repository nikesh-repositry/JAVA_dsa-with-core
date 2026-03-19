package SORTING.algos;
public class insertion {
    public static void main(String[] args) {
        int[] arr ={5,6,78,0,5,2,0,55,0,9,9,2};
        for(int i=1;i< arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
