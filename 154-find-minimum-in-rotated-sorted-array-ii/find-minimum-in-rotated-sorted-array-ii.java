class Solution {
    public int findMin(int[] nums) {
        int mx = Integer.MAX_VALUE;
        for (int num : nums) {
            mx = Math.min(mx, num);
        }
        return mx;
    }
}