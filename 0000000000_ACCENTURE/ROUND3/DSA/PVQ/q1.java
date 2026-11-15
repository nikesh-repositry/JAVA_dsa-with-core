/*
Problem Name: Kth Largest Element in an Array (also known as the Selection Problem or Order Statistics).
Description:
Given an unsorted integer array nums and an integer k, return the k-th largest element in the array. 
Note that it is the k-th largest element in sorted order, not the k-th distinct element. 
The goal is to solve it without sorting the entire array, ideally in O(N) average time complexity.
*/

import java.util.PriorityQueue;

public class MinHeapExample {
    public static int findNthGreatestHeap(int[] nums, int n) {
        // PriorityQueue in Java is a Min-Heap by default
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            
            // Keep only the top 'n' largest elements
            if (minHeap.size() > n) {
                minHeap.poll(); // Removes the smallest element in the heap
            }
        }

        // The root of the min-heap is the nth greatest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 30, 30};
        int n = 3;
        System.out.println(findNthGreatestHeap(arr, n)); // Output: 30
    }
}

/*
• minHeap.offer(num): Adds a new number into the queue. Behind the scenes, the queue immediately reorganizes itself so the smallest number moves to the front.
• minHeap.size(): Counts how many numbers are currently sitting inside the queue.
• minHeap.poll(): Removes and deletes the number at the very front of the queue. Because this is a Min-Heap, it always deletes the smallest number currently inside.
• minHeap.peek(): Looks at the number at the very front of the queue and returns it without deleting it.


1. Read 50: offer(50) adds it. Queue: [50] (size is 1, which is not > 3).
2. Read 20: offer(20) adds it. Queue: [20, 50] (size is 2, not > 3).
3. Read 40: offer(40) adds it. Queue: [20, 50, 40] (size is 3, not > 3).
4. Read 30: offer(30) adds it. Queue has 4 items (20, 30, 40, 50). Since size() > 3, poll() kicks out the smallest item (20). Queue: [30, 50, 40].
5. Read 30: offer(30) adds it. Queue has 4 items (30, 30, 40, 50). Since size() > 3, poll() kicks out the smallest item (30). Queue: [30, 50, 40].
6. Finish: The loop ends with the 3 largest numbers (30, 40, 50) inside. minHeap.peek() looks at the smallest of those three, returning 30.

*/
