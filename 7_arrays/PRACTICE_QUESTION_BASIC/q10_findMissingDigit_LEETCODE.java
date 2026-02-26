//EASY
//FIND MISSING NUMBER
//Input: nums = [0,1]
//Output: 2
package ARRAYS;
public class q10_findMissingDigit_LEETCODE {
    public static void main(String[] args) {
        int[] arr = {3,1,0};
        int n = arr.length;
        int total_sum = n*(n+1)/2;
        int array_sum =0;
        for(int i :arr){
            array_sum+=i;
        }
        System.out.println(total_sum-array_sum);
    }
}
/*
take out the expected sum then subtract it by actual array sum
then the difference is the actual required number 

 */
