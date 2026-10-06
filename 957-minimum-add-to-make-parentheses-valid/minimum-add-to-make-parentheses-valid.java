class Solution {
    public int minAddToMakeValid(String s) {
        int cnt = 0;
        int add = 0;

        if (s.length() == 0) {
            return 0;
        }
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                cnt++;
            } else if (cnt > 0) {
                cnt--;
            } else {
                add++;
            }
        }
        return add + cnt;
    }
}