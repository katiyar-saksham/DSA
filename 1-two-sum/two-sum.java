class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> st = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if (st.containsKey(comp)) {
                return new int[] { st.get(comp), i };
            }
            st.put(nums[i], i);
        }
        return new int[] {};
    }
}