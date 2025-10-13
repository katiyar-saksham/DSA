class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1); // freq update karo
        }

        int maxF = 0; // max freq find karni hai
        for (int f : freq.values()) {
            if (f > maxF) {
                maxF = f;
            }
        }

        int res = 0; // max freq wale elements ka total count
        for (int f : freq.values()) {
            if (f == maxF) {
                res += f;
            }
        }

        return res; // final answer
    }
}
