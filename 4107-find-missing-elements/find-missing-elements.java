class Solution {

    public List<Integer> findMissingElements(int[] nums) {

        int n = nums.length;

        List<Integer> res = new ArrayList<>();

        if (nums == null || n == 0) {
            return res;
        }

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            for (int j = nums[i - 1] + 1; j < nums[i]; j++) {
                res.add(j);
            }
        }
        return res;
    }
}