class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;

        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && chars[i] == chars[j]) {
                j++;
            }
            chars[write++] = chars[i];

            int cnt = j - i;
            if (cnt > 1) {
                String s = String.valueOf(cnt);
                for (char ch : s.toCharArray()) {
                    chars[write++] = ch;
                }
            }
            i = j;
        }

        return write;
    }
}