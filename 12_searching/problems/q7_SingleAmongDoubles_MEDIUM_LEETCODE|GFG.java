//find the only single element present in the array
class Solution {
    int single(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 1) {
            return arr[0];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if ((mid == 0 || arr[mid] != arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] != arr[mid + 1])) {
                return arr[mid];
            }
            int checkMid = mid;
            if (mid > 0 && arr[mid] == arr[mid - 1]) {
                checkMid = mid - 1;
            }
            int count = checkMid - start;
            
            if (count % 2 == 0) {
                start = checkMid + 2; 
            } else {
                end = checkMid - 1;
            }
        }
        return arr[start];
    }
}
