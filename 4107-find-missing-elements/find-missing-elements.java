class Solution {

    public List<Integer> findMissingElements(int[] nums) {

        int n = nums.length;

        List<Integer> res = new ArrayList<>();

        if (nums == null || n == 0) {
            return res;
        }

        Arrays.sort(nums);

        for (int i = 1; i < n; i++) {
            int prev = nums[i - 1];
            int nxt = nums[i];

            while (prev + 1 < nxt) {
                res.add(prev+1);
                prev++;
            }
        }
        return res;
    }
}