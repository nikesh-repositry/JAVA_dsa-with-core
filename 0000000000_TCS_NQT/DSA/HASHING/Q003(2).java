//method 2 of Q003
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character in text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Required counts for "balloon"
        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2; // needs 2 l's
        int o = map.getOrDefault('o', 0) / 2; // needs 2 o's
        int n = map.getOrDefault('n', 0);

        // Minimum of all required counts
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}
