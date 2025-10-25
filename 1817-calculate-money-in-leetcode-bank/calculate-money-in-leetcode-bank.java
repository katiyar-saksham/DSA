class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int mon = 1;

        while (n > 0) {
            for (int days = 0; days < 7 && n > 0; days++) {
                total += mon + days;
                n--;
            }
            mon++;
        }
        return total;
    }
}