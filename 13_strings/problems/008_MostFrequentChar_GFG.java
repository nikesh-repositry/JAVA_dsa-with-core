class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        char[] c = s.toCharArray();
        Arrays.sort(c);
        int count = 0;
        char result = c[0];
        
        int i=0,j=0;
        while(j<c.length){
            if(c[i]==c[j]){
                j++;
                
            }else if(c[i]!=c[j]){
                if( (j-i)>count){
                    count = j-i;
                    result = c[i];
                }
                i=j;
                
            }
        }
        if ((j - i) > count) {   //this is for the case when most frequent character in the last, dry run it once to catch it 
            result = c[i];
        }
        
        return result;
    }
}
