//complexity should be O(N+M) 
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int i=0,j=0;
        ArrayList <Integer> result = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                if(result.isEmpty() || result.get(result.size()-1)!=a[i]){
                    result.add(a[i]);
                }
                i++;
                j++;
            }else if(a[i]>b[j]){
                if(result.isEmpty() || result.get(result.size()-1)!=b[j]){
                    result.add(b[j]);
                }
                j++;
            }else{
                if(result.isEmpty() || result.get(result.size()-1)!=a[i]){
                    result.add(a[i]);
                }
                i++;
            }
        }
        while(i<a.length){
            if(result.isEmpty() || result.get(result.size()-1)!=a[i]){
                result.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(result.isEmpty() || result.get(result.size()-1)!=b[j]){
                result.add(b[j]);
            }
            j++;
        }return result;
    }
}
/*
Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: [1, 2, 3, 4, 5, 6, 7]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.*/
