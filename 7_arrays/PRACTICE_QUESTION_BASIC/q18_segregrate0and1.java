package ARRAYS;
//using quick sort
public class q15 {
    public static void segregate(int[] arr) {
        int a =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] =  arr[a];
                arr[a] = temp;
                a++;
            }
        }
    }
    public static void main(String[] args){
        int[] array = {0,1,0,1,0,0,1};
        segregate(array);
        for(int num:array){
            System.out.print(num+" ");
        }
    }
}
//taking a pivot then arranging all big in right and smaller to left of it
