// MaxMinSubarrayOfSizeK.java
// Auto-generated template for Sliding Window Problem

public class MaxMinSubarrayOfSizeK {

    // Method to solve the problem
    public static int solve(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;
        int maxSum;

        // Calculate sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        for (int i = 1; i <= n - k ; i++) {
            windowSum = windowSum + arr[i + k - 1] - arr[i - 1];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        System.out.println("Max sum of subarray of size " + k + " = " + solve(arr, k));
        // 9

        int[] arr2 = { 1, 9, -1, -2, 7, 3, -1, 2 };
        k = 4;
        System.out.println("Max sum of subarray of size " + k + " = " + solve(arr2, k));
        // 16
    }
}