class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        HashSet<Integer> st1 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                st1.add(nums[i] ^ nums[j]);
            }
        }

        HashSet<Integer> res = new HashSet<>();
        for (int s : st1) {
            for (int num : nums) {
                res.add(s ^ num);
            }
        }
        return res.size();
    }
}