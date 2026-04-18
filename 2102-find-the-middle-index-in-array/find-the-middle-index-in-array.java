class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;

        int ttl = 0;
        int Lsum = 0;

        for (int num : nums) {
            ttl += num;
        }
        for (int i = 0; i < n; i++) {
            if (Lsum == ttl - Lsum - nums[i]) {
                return i;
            }
            Lsum += nums[i];
        }
        return -1;
    }
}