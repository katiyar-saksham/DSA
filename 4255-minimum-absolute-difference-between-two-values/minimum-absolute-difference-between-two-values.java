class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int first = -1, second = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                first = i;
            } else if (nums[i] == 2) {
                second = i;
            }

            if (first != -1 && second != -1) {
                ans = Math.min(ans, Math.abs(first - second));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}