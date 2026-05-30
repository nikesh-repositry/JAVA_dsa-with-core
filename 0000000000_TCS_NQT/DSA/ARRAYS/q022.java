package ARRAYS;
//add elements
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // New array with extra space
        int[] newArr = new int[n + 3]; // +3 for three insertions

        // Insert at beginning
        System.out.print("Enter element to insert at beginning: ");
        int beg = sc.nextInt();
        newArr[0] = beg;
        for (int i = 0; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        // Insert at end
        System.out.print("Enter element to insert at end: ");
        int end = sc.nextInt();
        newArr[n + 1] = end;

        // Insert at position
        System.out.print("Enter element to insert at position: ");
        int ele = sc.nextInt();
        System.out.print("Enter position (1-based index): ");
        int pos = sc.nextInt();

        for (int i = n; i >= pos; i--) {
            newArr[i + 1] = newArr[i];
        }
        newArr[pos] = ele;

        // Print final array
        System.out.print("Final Array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if (i < newArr.length - 1) System.out.print(", ");
        }
    }
}
