class Solution {
    public int numberOfSpecialChars(String s) {
        int[] lwr = new int[26];
        int[] upr = new int[26];
        Arrays.fill(lwr, -1);
        Arrays.fill(upr, -1);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lwr[s.charAt(i) - 'a'] = i;
            } else {
                if (upr[ch - 'A'] == -1) {
                    upr[ch - 'A'] = i;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (lwr[i] != -1 &&
                    upr[i] != -1 &&
                    lwr[i] < upr[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}