class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        // Map to count frequencies of (num % value)
        int[] count = new int[value];

        for (int num : nums) {
            int mod = ((num % value) + value) % value; // ensure positive mod
            count[mod]++;
        }

        int i = 0;
        while (true) {
            int mod = i % value;
            if (count[mod] == 0) {
                return i;
            }
            count[mod]--;
            i++;
        }
    }
}
