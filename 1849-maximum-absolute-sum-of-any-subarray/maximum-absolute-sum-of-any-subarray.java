class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minEnd = nums[0];
        int maxEnd = nums[0];
        int res = Math.abs(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            minEnd = Math.min(num, minEnd + num);
            maxEnd = Math.max(num, maxEnd + num);
            res = Math.max(res, Math.max(Math.abs(minEnd), Math.abs(maxEnd)));
        }
        return res;
    }
}