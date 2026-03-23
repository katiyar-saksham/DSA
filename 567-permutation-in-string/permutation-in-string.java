class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int k = s1.length();
        int[] winFreq = new int[26];
        for (int i = 0; i < k; i++) {
            winFreq[s2.charAt(i) - 'a']++;
        }

        if (matches(freq, winFreq)) {
            return true;
        }
        for (int i = k; i < s2.length(); i++) {
            winFreq[s2.charAt(i) - 'a']++;
            winFreq[s2.charAt(i - k) - 'a']--;

            if (matches(freq, winFreq)) {
                return true;
            }
        }
        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}