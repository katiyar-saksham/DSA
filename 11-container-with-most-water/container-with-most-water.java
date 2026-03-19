class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int res = Math.min(height[r], height[l]) * (r - l);

        while (l < r) {
            // res = Math.min(height[r], height[l]) * (r - l);
            if (height[r] < height[l]) {
                r--;
                res = Math.max(res, Math.min(height[r], height[l]) * (r - l));
            } else {
                l++;
                res = Math.max(res, Math.min(height[r], height[l]) * (r - l));
            }
        }
        return res;
    }
}