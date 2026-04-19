class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] pMax = new int[n];
        int[] sMin = new int[n];

        pMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pMax[i] = Math.max(pMax[i - 1], nums[i]);
        }

        sMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sMin[i] = Math.min(nums[i], sMin[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int score = pMax[i] - sMin[i];
            if (score <= k) {
                return i;
            }
        }
        return -1;
    }
}