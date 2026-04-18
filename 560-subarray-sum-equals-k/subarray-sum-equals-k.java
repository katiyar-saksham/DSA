class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int cnt = 0, sum = 0;

        mpp.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (mpp.containsKey(sum - k)) {
                cnt += mpp.get(sum - k);
            }
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}