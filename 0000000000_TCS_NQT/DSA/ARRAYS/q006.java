// move 0 and 1 with out sorting method
class Solution {
    public static void moveZeroOne(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // If left is 0, it's already in correct place
            if (arr[left] == 0) {
                left++;
            }
            // If right is 1, it's already in correct place
            else if (arr[right] == 1) {
                right--;
            }
            // If left is 1 and right is 0 → swap
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
        moveZeroOne(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 0 0 0 0 1 1 1 1
    }
}
