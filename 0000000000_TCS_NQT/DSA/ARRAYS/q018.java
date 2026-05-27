// rotate array by k both left and right
/*
🔹 Left Rotation Logic
When you left rotate by d:
Reverse the first d elements.
Reverse the remaining n-d elements.
Reverse the whole array.
👉 This shifts the array to the left, so the first d elements move to the end.
Example:
[1, 2, 3, 4, 5], d=2
Reverse first 2 → [2, 1, 3, 4, 5]
Reverse rest → [2, 1, 5, 4, 3]
Reverse whole → [3, 4, 5, 1, 2] ✅ left rotated.

🔹 Right Rotation Logic
When you right rotate by d:
Reverse the last d elements.
Reverse the first n-d elements.
Reverse the whole array.
👉 This shifts the array to the right, so the last d elements move to the front.
Example:
[1, 2, 3, 4, 5], d=2
Reverse last 2 → [1, 2, 3, 5, 4]
Reverse first 3 → [3, 2, 1, 5, 4]
Reverse whole → [4, 5, 1, 2, 3] ✅ right rotated.
 */
package ARRAYS;
import java.util.Scanner;

public class q06 {
    public static void rev(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void leftRotate(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        rev(arr, 0, d-1);      // reverse first d
        rev(arr, d, n-1);      // reverse rest
        rev(arr, 0, n-1);      // reverse whole
    }

    public static void rightRotate(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        rev(arr, n-d, n-1);    // reverse last d
        rev(arr, 0, n-d-1);    // reverse first n-d
        rev(arr, 0, n-1);      // reverse whole
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter element no. " + (i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("enter rotation distance d");
        int d = sc.nextInt();

        // Make copies so both rotations can be shown
        int[] leftArr = arr.clone();
        int[] rightArr = arr.clone();

        leftRotate(leftArr, d);
        rightRotate(rightArr, d);

        System.out.println("Array after left rotation:");
        for(int ele : leftArr){
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.println("Array after right rotation:");
        for(int ele : rightArr){
            System.out.print(ele + " ");
        }
    }
}
