// implement move 0 1 2 dutch national flag
class Solution {
    public void sort012(int[] arr) {
        // code here
        int i=0;
        int j=0;
        int k = arr.length-1;
        while(j<=k){
            switch (arr[j]){
                case 0:
                    int temp0 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp0;
                    i++;
                    j++;
                    break;
                case 1:
                    j++;
                  
                    break;
                case 2:
                    int temp1 = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp1;
        
                    k--;
                    break;
            }
        }
    }
}
