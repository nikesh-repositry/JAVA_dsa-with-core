//EASY
//TWO SUM
//FIND TWO NUMBERS IN THE ARRAY THAT ADD UP TO THE GIVEN TARGET VALUE
//USING BRUTE FORCE
package ARRAYS;
public class q7   {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4};
        int target = 6;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("index of both digit are "+i+" "+j);
                    flag = true;
                    break;
                }
            }
            if(flag) break;  //if you want to print all pairs then remove this code line
        }
        if(!flag) System.out.println("no pair found");
    }
}
