class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int mx = Integer.MIN_VALUE;
        int[] sfx = new int[n];

        sfx[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            sfx[i] = Math.min(nums[i], sfx[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);

            if (mx - sfx[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}
