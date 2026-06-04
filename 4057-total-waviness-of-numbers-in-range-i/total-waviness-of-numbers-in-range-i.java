class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int i = num1; i <= num2; i++) {
            ans += helper(i);
        }
        return ans;
    }

    private int helper(int num) {
        String s = String.valueOf(num);
        if (s.length() < 3) {
            return 0;
        }

        int cnt = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            char l = s.charAt(i - 1);
            char c = s.charAt(i);
            char r = s.charAt(i + 1);

            if (c > l && c > r ||
                    (c < l && c < r)) {
                cnt++;
            }
        }
        return cnt;
    }
}