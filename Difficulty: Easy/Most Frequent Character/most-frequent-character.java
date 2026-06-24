class Solution {
    public char getMaxOccuringChar(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int mx = 0;
        int idx = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > mx) {
                mx = freq[i];
                idx = i;
            }
        }

        return (char) (idx + 'a');
    }
}