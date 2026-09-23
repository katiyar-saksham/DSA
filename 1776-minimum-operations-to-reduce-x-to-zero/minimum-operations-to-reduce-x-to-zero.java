class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (sum < x) {
            return -1;
        }

        int res = sum - x;

        int l = 0;
        int sm = 0;
        int maxLen = -1;

        for (int r = 0; r < n; r++) {
            sm += nums[r];

            while (sm > res) {
                sm -= nums[l++];
            }

            if (sm == res) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }

        if (maxLen == -1) {
            return -1;
        }

        return n - maxLen;
    }
}