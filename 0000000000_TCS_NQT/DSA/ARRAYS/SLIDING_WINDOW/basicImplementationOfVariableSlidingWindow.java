// THIS PROGRAM IS THE BASIC IMPLEMENTATION OF SLIDING WINDOW PATTERN IN ARRAYS
// Variable Size Window Example
// PROBLEM = GIVEN AN ARRAY OF INTEGERS AND A TARGET SUM, FIND THE LENGTH OF THE SMALLEST SUBARRAY
//           WHOSE SUM IS GREATER THAN OR EQUAL TO THE TARGET.

package ARRAYS;
public class SLIDINGWINDOWVARIABLE {
    public static int minSubArrayLen(int target, int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int l = 0;              // left pointer
        int currSum = 0;        // current window sum
        int minLen = Integer.MAX_VALUE; // track smallest window length
        // Step 1: Expand the window by moving right pointer
        for (int r = 0; r < arr.length; r++) {
            currSum += arr[r];
            // Step 2: Shrink the window while condition is satisfied
            while (currSum >= target) {
                minLen = Math.min(minLen, r - l + 1); // update min length
                currSum -= arr[l]; // remove leftmost element
                l++;               // move left pointer
            }
        }
        // If no valid window found, return 0
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, arr));  
        // Output: 2 (subarray [4,3])
    }
}
