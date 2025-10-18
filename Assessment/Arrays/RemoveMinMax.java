class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIdx = -1;
        int maxIdx = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }

        int opt1 = Math.max(minIdx, maxIdx) + 1; // rm both from left
        int opt2 = n - Math.min(minIdx, maxIdx); // rm both from right
        int opt3 = (Math.min(minIdx, maxIdx) + 1) + (n - Math.max(minIdx, maxIdx)); // rm one from each side

        return Math.min(opt1, Math.min(opt2, opt3));
    }
}
