class Solution {
    long mod = 1000000007;
    long[][] dp;

    public int numOfWays(int[] nums) {
        int n = nums.length;
        dp = new long[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = dp[i][i] = 1;

            for (int j = 1; j < i; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % mod;
            }
        }

        return (int) ((solve(nums) - 1 + mod) % mod);
    }

    public long solve(int[] nums) {
        int n = nums.length;

        if (n <= 2) return 1;

        int root = nums[0];
        int l = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < root) l++;
        }

        int[] left = new int[l];
        int[] right = new int[n - l - 1];

        int x = 0, y = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < root) {
                left[x++] = nums[i];
            } else {
                right[y++] = nums[i];
            }
        }

        long a = solve(left);
        long b = solve(right);

        long ans = dp[n - 1][l];
        ans = ans * a % mod;
        ans = ans * b % mod;

        return ans;
    }
}