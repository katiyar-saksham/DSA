class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        Arrays.sort(nums);
        int cnt = 1;
        int maxLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                cnt++;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                cnt = 1;
            }
            maxLen = Math.max(maxLen, cnt);
        }
        return maxLen;
    }
}