class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int o = 0;
        int z = 0;
        int res = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num == 1) {
                o++;
            }
        }
        if (o <= 1) {
            return 0;
        }
        if (o == 1) {
            return 1;
        }

        for (int i = 0; i < o; i++) {
            if (nums[i % n] == 0) {
                z++;
            }
        }
        res = z;
        for (int i = o; i < n + o; i++) {
            if (nums[i % n] == 0) {
                z++;
            }
            if (nums[(i - o) % n] == 0) {
                z--;
            }
            res = Math.min(res, z);
        }

        return res;
    }
}