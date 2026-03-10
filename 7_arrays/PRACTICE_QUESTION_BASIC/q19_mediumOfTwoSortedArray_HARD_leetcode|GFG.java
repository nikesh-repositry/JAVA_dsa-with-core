//hard
//find median of two sorted array after combining them in sorted way
class Solution {
    public double medianOf2(int[] nums1, int[] nums2) {
        double sum = 0;
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < nums1.length) {
                arr[i] = nums1[i];
            } else {
                arr[i] = nums2[i - nums1.length];
            }
        }
        Arrays.sort(arr);
        if (n % 2 == 0) {
            sum = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            sum = (double) arr[n / 2];
        }
        return sum;
    }
}
