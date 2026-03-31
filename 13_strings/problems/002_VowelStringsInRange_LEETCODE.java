class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left;i<right+1;i++){
            char f = Character.toLowerCase(words[i].charAt(0));
            char l = Character.toLowerCase(words[i].charAt(words[i].length() - 1));
            if((f=='a' || f=='e'||f=='i'||f=='o'||f=='u') && (l=='a' || l=='e'||l=='i'||l=='o'||l=='u') ){
                count++;
            }
        }return count;
    }
}
/*Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2
Explanation: 
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.*/

//////mistakes
/*Using = instead of ==  
You wrote if(words[j].charAt(0) = a|e|i|o|u ...) which is assignment, not comparison.
→ In Java, = assigns, == compares.

Declaring vowels incorrectly  
You wrote char a = a, e = e... which is invalid. Characters must be written as 'a', 'e', etc.

Wrong use of ||  
You tried words[j].charAt(0) == a||e||i||o||u.
→ || needs full boolean expressions, not just values. Each vowel must be compared explicitly.

Calling .toLowerCase() on a char  
char is a primitive, so you can’t call methods on it.
→ Use Character.toLowerCase(char) instead.*/
