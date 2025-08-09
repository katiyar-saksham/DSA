class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sq = new int[nums.length];
        int pos = nums.length - 1;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                sq[pos--] = nums[l] * nums[l];
                l++;
            } else {
                sq[pos--] = nums[r] * nums[r];
                r--;
            }
        }
        return sq;
    }
}