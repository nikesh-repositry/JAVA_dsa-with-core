/*
================================================================================
PROBLEM STATEMENT:
Next Palindromic Perfect Square Difference

Given an integer N, find the next integer X > N such that X is both a perfect 
square and a palindrome. Return the absolute difference (X - N).

Example:
Input: 404 -> Next Palindromic Square: 484 (22 * 22) -> Output Difference: 484 - 404 = 80
================================================================================
*/

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public long nextPalindromicSquareDiff(long N) {
        
        // WHAT: Find the starting integer root whose square will be strictly greater than N.
        // HOW: If N < 0, start root at 0; otherwise, take (long) Math.sqrt(N) + 1.
        // WHY: Instead of checking every single number after N (which is slow), we only 
        //      generate perfect squares (root * root) starting right after N!
        long root = (N < 0) ? 0 : (long) Math.sqrt(N) + 1;

        // WHAT: Loop infinitely over consecutive roots to generate the next perfect squares.
        // HOW: Use while (true), compute square = root * root, and check if it is a palindrome.
        // WHY: Every iteration guarantees 'square' is a perfect square > N, so the very first 
        //      palindrome we hit is guaranteed to be the smallest valid X.
        while (true) {
            long square = root * root;

            // WHAT: Check if the current perfect square reads the same forwards and backwards.
            // HOW: Pass 'square' to our helper method isPalindrome(square).
            // WHY: Once both conditions (perfect square AND palindrome) are met, we return (square - N).
            if (isPalindrome(square)) {
                return square - N;
            }

            // Move to the next integer root to test the next perfect square
            root++;
        }
    }

    // HELPER FUNCTION: Checks if a number is a palindrome using simple String reversal
    private boolean isPalindrome(long num) {
        
        // WHAT: Convert the number into a String and reverse it.
        // HOW: Use String.valueOf(num) and new StringBuilder(s).reverse().toString().
        // WHY: Comparing the original string with its reversed version is the cleanest, 
        //      most bug-free way to check for a palindrome in Java.
        String original = String.valueOf(num);
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Example from the problem image
        long input1 = 404;
        long output1 = obj.nextPalindromicSquareDiff(input1);
        System.out.println("Sample 1 Input : " + input1);
        System.out.println("Sample 1 Output: " + output1);

        System.out.println("------------------------------------");

        // Sample Test Case 2: Input is already a palindromic square (121 -> next is 484)
        long input2 = 121;
        long output2 = obj.nextPalindromicSquareDiff(input2);
        System.out.println("Sample 2 Input : " + input2);
        System.out.println("Sample 2 Output: " + output2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Sample 1 (From Image):
Input : N = 404
Step-by-step trace:
  - sqrt(404) = 20.09 -> starting root = 21
  - root = 21 -> 21 * 21 = 441 (Not a palindrome)
  - root = 22 -> 22 * 22 = 484 (Palindrome! And 484 > 404)
  - Difference = 484 - 404 = 80
Output: 80

--------------------------------------------------------------------------------

Sample 2:
Input : N = 121
Step-by-step trace:
  - sqrt(121) = 11 -> starting root = 12 (since X must be strictly > N)
  - Squares tested: 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484 (Palindrome!)
  - Difference = 484 - 121 = 363
Output: 363
================================================================================
*/
