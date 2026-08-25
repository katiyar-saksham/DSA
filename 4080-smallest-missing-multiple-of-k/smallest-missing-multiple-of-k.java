class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int target = k;

        for (int num : nums) {
            if (num == target) {
                target += k;
            } else if (num < target) {
                continue;
            } else {
                return target;
            }
        }

        return target;
    }
}