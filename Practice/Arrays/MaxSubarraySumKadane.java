
public class MaxSubarraySumKadane {

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int num : nums) {
            currSum = Math.max(num, currSum + num);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

}