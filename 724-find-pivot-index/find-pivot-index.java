class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = nums[0];

        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (res[i] - nums[i] == (res[n - 1] - res[i])) {
                return i;
            }
        }
        return -1;
    }
}