//BASIC
//SEARCH IN ARRAY AN ELEMENT
package ARRAYS;

public class q6 {
    public static void main(String[] args) {
        int a = 7;
        int[] arr={1,5,5,6};
        boolean y = false;
        for(int i=0;i< arr.length;i++){
//            boolean y = false;
            if(arr[i]==a){
                y = true;
            }
        }
        System.out.println(y);
    }
}
