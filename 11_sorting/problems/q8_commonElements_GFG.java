// User function Template for Java
//find common elements between two arrays
class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        int i=0,j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer>result=new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                result.add(a[i]);
                i++;
                j++;
            }else if(a[i]>b[j]){
                j++;
            }else{
                i++;
            }
        }return result;
    }
}
/*Input: a[] = [3, 6, 1, 7, 9, 8, 2, 2] , b[] = [9, 7, 3, 4, 9]
Output: 3 7 9
Explanation: The common elements in sorted order are [3, 7, 9]*/
