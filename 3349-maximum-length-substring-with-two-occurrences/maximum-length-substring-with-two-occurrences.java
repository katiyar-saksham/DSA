class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int left = 0;
        int ans = 0;

        int[] freq = new int[26];
        for (int r = 0; r < n; r++) {
            freq[s.charAt(r) - 'a']++;

            while (freq[s.charAt(r) - 'a'] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            ans = Math.max(ans, r - left + 1);
        }

        return ans;
    }
}