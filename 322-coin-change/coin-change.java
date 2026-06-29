class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans = helperDP(coins, amount, dp);
        if (ans == Integer.MAX_VALUE)
            return -1;
        else
            return ans;
    }

    private int helperDP(int[] coins, int amount, int[] dp) {

        if (amount == 0)
            return 0;
        if (amount < 0)
            return Integer.MAX_VALUE;
        if (dp[amount] != -1)
            return dp[amount];

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int ans = helperDP(coins, amount - coins[i], dp);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, ans + 1);
            }
        }
        dp[amount] = mini;
        return mini;
    }

    // private int helperRec(int[] coins, int amount) {

    //     if (amount == 0)
    //         return 0;
    //     if (amount < 0)
    //         return Integer.MAX_VALUE;

    //     int mini = Integer.MAX_VALUE;
    //     for (int i = 0; i < coins.length; i++) {
    //         int ans = helper(coins, amount - coins[i]);
    //         if (ans != Integer.MAX_VALUE) {
    //             mini = Math.min(mini, ans + 1);
    //         }
    //     }
    //     return mini;
    // }
}