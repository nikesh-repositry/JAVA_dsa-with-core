//longest palindrome that can be made from the given string 
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                length += freq; 
            } else {
                length += freq - 1;
                hasOdd = true;      
            }
        }


        if (hasOdd) {
            length += 1;
        }

        return length;
    }
}
