class Solution {
    public int numSub(String s) {
        long res = 0;
        long len = 0;
        final long MOD = 1_000_000_007;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                len++;
            } else {
                if (len > 0) {
                    res = (res + len * (len + 1) / 2) % MOD;
                    len = 0;
                }
            }
        }

        // last run
        if (len > 0) {
            res = (res + len * (len + 1) / 2) % MOD;
        }

        return (int) res;
    }
}
