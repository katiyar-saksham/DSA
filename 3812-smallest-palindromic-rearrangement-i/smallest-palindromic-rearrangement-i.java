class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray())
            freq[c - 'a']++;

        char[] ans = new char[s.length()];
        int l = 0, r = s.length() - 1;

        int mid = -1;

        for (int i = 0; i < 26; i++) {
            while (freq[i] >= 2) {
                ans[l++] = (char) ('a' + i);
                ans[r--] = (char) ('a' + i);
                freq[i] -= 2;
            }

            if (freq[i] == 1)
                mid = i;
        }

        if (mid != -1)
            ans[l] = (char) ('a' + mid);

        return new String(ans);
    }
}