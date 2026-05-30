//common subsequence
package STRINGS;

public class CommonSubsequenceCount {
    public static void main(String[] args) {
        String X = "abc";
        String Y = "ac";

        int m = X.length();
        int n = Y.length();

        int[][] dp = new int[m + 1][n + 1];

        // Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
                }
            }
        }

        System.out.println("Count of common subsequences = " + dp[m][n]);
    }
}
/*
Input: X = "abc", Y = "ac"  
Output: Count = 3  
(common subsequences are "a", "c", "ac").

Input: X = "aaa", Y = "aa"  
Output: Count = 5  
(common subsequences: "a", "a", "a", "aa", "aa" — duplicates are counted).*/
