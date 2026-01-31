//BASIC
//LINEAR SEARCH IN ARRAY AN ELEMENT
package ARRAYS;
public class q6 {
    public static void main(String[] args) {
        int a = 5;
        int[] arr={1,5,5,6};
        boolean y = false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==a){
                System.out.println("yes target element exists in index "+i);
                y = true;
                break;
            }
        }
        if(!y) System.out.println("element does not exists in the array");
    }
}
