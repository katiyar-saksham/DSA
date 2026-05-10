class Solution {
    int[] dp;

    public int maximumJumps(int[] nums, int target) {
        dp = new int[nums.length];
        Arrays.fill(dp, -2);

        int ans = solve(0, nums, target);
        return ans == -1 ? -1 : ans;
    }

    private int solve(int i, int[] nums, int target) {
        if (i == nums.length - 1) {
            return 0;
        }

        //already stored check kr rhe h to avoid reCalc
        if (dp[i] != -2) {
            return dp[i];
        }

        int res = -1;

        for (int j = i + 1; j < nums.length; j++) {
            if (Math.abs(nums[i] - nums[j]) <= target) {
                int temp = solve(j, nums, target);

                if (temp != -1) {
                    res = Math.max(res, 1 + temp);
                }
            }
        }
        return dp[i] = res;
    }
}