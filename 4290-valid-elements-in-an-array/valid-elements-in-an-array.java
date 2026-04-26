class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();

        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(nums[i], rightMax[i + 1]);
        }

        int leftMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1 || nums[i] > leftMax || nums[i] > rightMax[i + 1]) {
                res.add(nums[i]);
            }
            leftMax = Math.max(leftMax, nums[i]);
        }
        return res;
    }
}