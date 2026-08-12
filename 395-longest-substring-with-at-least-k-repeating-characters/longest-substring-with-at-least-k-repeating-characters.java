class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a'] < k) {

                int left = longestSubstring(
                        s.substring(0, s.indexOf(ch)), k);

                int right = longestSubstring(
                        s.substring(s.indexOf(ch) + 1), k);

                return Math.max(left, right);
            }
        }

        return n;
    }
}