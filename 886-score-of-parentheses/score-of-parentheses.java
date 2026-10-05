class Solution {
    public int scoreOfParentheses(String s) {
        int dpt = 0;
        int scr = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                dpt++;
            } else {
                dpt--;
                if (s.charAt(i - 1) == '(') {
                    scr += 1 << dpt;
                }
            }
        }

        return scr;
    }
}