class Solution {
    public int minInsertions(String s) {
        int need = 0;
        int insertion = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (need % 2 != 0) {
                    insertion++;
                    need--;
                }
                need += 2;
            } else {
                need--;
                if (need < 0) {
                    insertion++;
                    need = 1;
                }
            }
        }
        return insertion + need;
    }
}