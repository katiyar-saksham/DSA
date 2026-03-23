class Solution {
    public int maxScore(int[] nums, int k) {
        int max = 0, lsum = 0, rsum = 0;
        int right = nums.length - 1;

        for (int i = 0; i < k; i++) {
            lsum += nums[i];
        }

        max = lsum;

        for (int i = k - 1; i >= 0; i--) {
            lsum -= nums[i];
            rsum += nums[right--];

            max = Math.max(max, lsum + rsum);
        }
        return max;
    }
}