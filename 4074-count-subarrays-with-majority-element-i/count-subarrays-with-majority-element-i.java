class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int[] cSum = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = (nums[i] == target) ? 1 : -1;
            cSum[i] = nums[i];
            if (i > 0)
                cSum[i] += cSum[i - 1];
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = cSum[j];
                if (i > 0)
                    sum -= cSum[i - 1];

                if (sum > 0)
                    ans++;
            }
        }

        return ans;
    }
}