class Solution {

    public int minFlips(String s) {

        int n = s.length();

        int one = 0;
        int zero = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                zero++;
            } else {
                one++;
            }
        }

        int ans = 0;

        if (one >= 1) {
            ans = Math.min(zero, one - 1);
        }

        if (n > 1 && s.charAt(0) == '1' && s.charAt(n - 1) == '1') {
            ans = Math.min(ans, one - 2);
        }

        return ans;
    }
}