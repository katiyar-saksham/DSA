class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int cnt = 0;
        for (int c : costs) {
            if (coins >= c) {
                coins -= c;
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }
}