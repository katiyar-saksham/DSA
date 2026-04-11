class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt = 0;
        for (int num : nums) {
            if (num == 0 && digit == 0) {
                cnt++;
            }
            while (num > 0) {
                int dgt = num % 10;
                if (dgt == digit) {
                    cnt++;
                }
                num /= 10;
            }
        }
        return cnt;
    }
}