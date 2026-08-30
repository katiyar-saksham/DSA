class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = 0;
        int mx = 0;
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[min]) {
                min = i;
            } else if (nums[i] > nums[mx]) {
                mx = i;
            }
        }

        int left = Math.max(min, mx) + 1;
        int right = n - Math.min(min, mx);
        int leftRight = (min + 1) + (n - mx);
        int rightLeft = (mx + 1) + (n - min);

        return Math.min(
                Math.min(left, right),
                Math.min(leftRight, rightLeft));
    }
}