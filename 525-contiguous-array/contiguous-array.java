class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int res = 0;
        int sum = 0;
        mpp.put(sum, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }

            if (mpp.containsKey(sum)) {
                res = Math.max(i - mpp.get(sum), res);
            } else {
                mpp.put(sum, i);
            }
        }
        return res;
    }
}