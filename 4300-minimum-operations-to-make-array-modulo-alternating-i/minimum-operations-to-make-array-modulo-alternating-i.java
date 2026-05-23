class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int x = 0; x < k; x++) {
            for (int y = 0; y < k; y++) {
                if (x == y)
                    continue;

                int cost = 0;

                for (int i = 0; i < n; i++) {
                    int r = nums[i] % k;
                    int t = (i % 2 == 0) ? x : y;

                    int inc = (t - r + k) % k;
                    int dec = (r - t + k) % k;

                    cost += Math.min(inc, dec);
                }

                ans = Math.min(ans, cost);
            }
        }

        return ans;
    }
}