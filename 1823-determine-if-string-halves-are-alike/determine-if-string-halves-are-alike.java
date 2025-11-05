class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < n / 2; i++) {
            if (isVowel(s.charAt(i)))
                cnt1++;
            if (isVowel(s.charAt(i + n / 2)))
                cnt2++;
        }
        return cnt1 == cnt2;
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
