class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return nums[i];
            }
        }
        return -1;
    }
}