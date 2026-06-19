class Solution {
    public int largestAltitude(int[] gain) {
        int mx = 0;
        int sum = 0;
        for (int g : gain) {
            sum += g;
            mx = Math.max(sum, mx);
        }
        return mx;
    }
}