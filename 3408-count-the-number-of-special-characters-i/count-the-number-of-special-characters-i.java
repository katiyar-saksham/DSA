class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean lwr = false;
            boolean upr = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    lwr = true;
                }
                if (word.charAt(i) == Character.toUpperCase(ch)) {
                    upr = true;
                }
            }
            if (lwr && upr) {
                cnt++;
            }
        }
        return cnt;
    }
}