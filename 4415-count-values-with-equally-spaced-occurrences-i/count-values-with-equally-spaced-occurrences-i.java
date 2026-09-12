class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int x = 1; x <= 100; x++) {
            int[] idx = new int[3];
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (nums[i] == x) {
                    if (count < 3) {
                        idx[count] = i;
                    }
                    count++;
                }
            }

            if (count == 3) {
                if (idx[1] - idx[0] == idx[2] - idx[1]) {
                    ans++;
                }
            }
        }

        return ans;
    }
}