//
//merge two sorted array with out inbuilt sorting methods
package ARRAYS;
public class q16 {
    public static void main(String[] args) {
        int[] a ={6,8,9,10,13};
        int[] b ={-1,0,2,5,7,12};
        int[] c = new int[a.length+b.length];
        merg(c,a,b);
        for(int ele: c) System.out.print(ele+" ");
    }
    private static void merg(int[] c, int[] a, int[] b) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
    }
}
