class Solution {
    public int maxDistance(String moves) {
        int x = 0;
        int y = 0;
        int oth = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'U') {
                y++;
            } else if (ch == 'D') {
                y--;
            } else if (ch == 'L') {
                x--;
            } else if (ch == 'R') {
                x++;
            } else {
                oth++;
            }
        }
        int res = Math.abs(x - 0) + Math.abs(y - 0);
        return res + oth;
    }
}