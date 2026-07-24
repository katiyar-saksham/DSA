class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        int mx = 0;

        for (int num : nums) {
            mx = Math.max(mx, num);
        }

        int t = 1;
        while (t <= mx) {
            t *= 2;
        }

        boolean[] s1 = new boolean[t];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                s1[nums[i] ^ nums[j]] = true;
            }
        }

        boolean[] res = new boolean[t];
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i])
                continue;
            for (int j = 0; j < n; j++) {
                res[i ^ nums[j]] = true;
            }
        }

        int b = 0;
        for (boolean r : res) {
            if (r)
                b++;
        }
        return b;
    }
}