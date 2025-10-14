class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        if (n < 2 * k)
            return false;

        for (int i = 0; i <= n - 2 * k; i++) {
            if (isIncreasing(nums,k,i) && isIncreasing(nums,k,i+k)) {
                return true;
            }
        }

        return false;
    }

    boolean isIncreasing(List<Integer> nums, int k, int i) {
        for (int j = i + 1; j < i + k; j++) {
            if (nums.get(j) <= nums.get(j - 1)) {
                return false;
            }
        }
        return true;
    }
}