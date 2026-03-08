class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();

        helper(nums, 0, res, sb);
        return res;
    }

    private void helper(int[] nums, int idx, List<List<Integer>> res, List<Integer> sb) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(sb));
            return;
        }

        sb.add(nums[idx]); //pick
        helper(nums, idx + 1, res, sb);

        sb.remove(sb.size() - 1); // skip
        helper(nums, idx + 1, res, sb);
        return;
    }
}