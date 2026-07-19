class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] taken = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (taken[ch - 'a']) {
                continue;
            }

            while (sb.length() > 0 &&
                    sb.charAt(sb.length() - 1) > ch &&
                    lastIndex[sb.charAt(sb.length() - 1) - 'a'] > i) {

                char removed = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                taken[removed - 'a'] = false;
            }

            sb.append(ch);
            taken[ch - 'a'] = true;
        }

        return sb.toString();
    }
}