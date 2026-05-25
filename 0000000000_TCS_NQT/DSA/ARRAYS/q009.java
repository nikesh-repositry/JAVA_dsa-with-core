//THIS PROGRAM IS THE BASIC IMPLEMENTATION OF SLIDING WINDOW PATTERN IN ARRAYS
//Maximum Sum Subarray of Size K (Fixed Window) SLIDING WINODW
//PROBLEM = GIVEN AN ARRAY OF INTEGERS AND NUMBER K FIND THE MAXIMUM SUM OF ANY CONTIGUOUS SUBARRAY OF  SIZE K
package ARRAYS;

public class SLIDINGWINDOWBASICS {
    public static long sum(int[] arr, int k) {
        if (arr == null || k <= 0 || arr.length < k) {
            return 0;
        }

        long maxSum = 0;
        long currSum = 0;

        // Step 1: Calculate sum of first window and this is will execute only one time in the program
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        maxSum = currSum;

        // Step 2: Slide the window, the window slide by the size of k 
        for (int i = k; i < arr.length; i++) {
            currSum += arr[i] - arr[i - k];  // add new one, remove old one
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 5, 3};
        int k = 3;
        System.out.println(sum(arr, k));  // Output: 9
    }
}
