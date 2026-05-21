class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        long sum = 0, max = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        if (mpp.size() == k) {
            max = sum;
        }

        for (int i = k; i < n; i++) {
            sum += nums[i];
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);

            sum -= nums[i - k];
            mpp.put(nums[i - k], mpp.get(nums[i - k]) - 1);
            if (mpp.get(nums[i - k]) == 0) {
                mpp.remove(nums[i - k]);
            }

            if (mpp.size() == k) {
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}