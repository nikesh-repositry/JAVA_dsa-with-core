class Solution {
    public int sqrt(long k){
        if(k==0) return 0;
        long i=1,j=k;
        while(i<=j){
            long m=i+(j-i)/2;
            if(m==k/m) return (int)m;
            else if(m>k/m) j = m-1;
            else if(m<k/m) i = m+1;
        }
        return (int)j;
    }
    public int arrangeCoins(int n) {
        long x =(long)n;
        return (int)(sqrt(8*(long)x+1)-1)/2;   //it is the solution of quadratic equation of sum of first n integer n(n+1)/2 . sum<=n
    }
}
