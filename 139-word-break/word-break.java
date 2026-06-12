class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> st = new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length()];

        return solve(s, st, 0,dp);
    }

    private boolean solve(String s, Set<String> st, int idx, Boolean[] dp) {
        if (idx == s.length()) {
            return true;
        }

        if (dp[idx] != null) {
            return dp[idx];
        }

        for (int end = idx; end < s.length(); end++) {
            String part = s.substring(idx, end + 1);
            if (st.contains(part)) {
                if (solve(s, st, end + 1,dp)) {
                    return dp[idx] = true;
                }
            }
        }
        return dp[idx] = false;
    }
}