class Solution {
    public int minSwaps(int[] nums) {
        int ones = 0;
        for (int x : nums) {
            if (x == 1) ones++;
        }

        if (ones <= 1) return 0;
        int n = nums.length;
        int curr = 0;

        for (int i = 0; i < ones; i++) {
            curr += nums[i % n];
        }

        int maxOnes = curr;
        for (int i = ones; i < n + ones; i++) {
            curr -= nums[(i - ones) % n];
            curr += nums[i % n];

            maxOnes = Math.max(maxOnes, curr);
        }

        return ones - maxOnes;
    }
}