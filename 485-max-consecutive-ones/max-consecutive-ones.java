class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count=0;

        for (int i = 0; i < nums.length; i++) {
            count++;
            if (nums[i] == 0) {
                count = 0;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}