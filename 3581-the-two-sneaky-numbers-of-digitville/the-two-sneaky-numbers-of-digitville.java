class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                res[cnt++] = nums[i];
            }
        }

        return res;
    }
}