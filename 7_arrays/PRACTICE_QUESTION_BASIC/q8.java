//EASY
//SECOND LARGEST/MAXIMUM
//FIND THE SECOND LARGEST ELEMENT IN THE ARRAY
//USING SINGLE FOR LOOP
package ARRAYS;
public class q8 {
    public static void main(String[] args) {
        int[] arr = {-52,-65161,0,68468,656816,56161,68168161,13665164,651651};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max1 ){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2 && arr[i]<max1){ //this is used when same elements found
                max2=arr[i];
            }
        }
        if(max1==Integer.MIN_VALUE && max2==Integer.MIN_VALUE) System.out.println("array is empty");
        else if (max2==Integer.MIN_VALUE) System.out.println("all values are equal or only one element in array");
        else System.out.println(max2 +" is second maximum");
    }
}
//there is a second way to do this using sort method and core concept is
/*
Arrays.sort(arr);
for (int i = n - 2; i >= 0; i--) {
    if (arr[i] != arr[n - 1]) {
        return arr[i];   // exits immediately when found
    }
}
 */
