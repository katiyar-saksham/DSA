class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int num : nums) {
            int mod = ((num % value) + value) % value;
            mpp.put(mod, mpp.getOrDefault(mod, 0) + 1);
        }

        int i = 0;
        while (true) {
            int mod = i % value;
            if (!mpp.containsKey(mod) || mpp.get(mod) == 0) {
                return i;
            }
            mpp.put(mod, mpp.get(mod) - 1);
            i++;
        }
    }
}