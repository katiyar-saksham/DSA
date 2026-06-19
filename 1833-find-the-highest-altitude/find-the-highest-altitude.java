class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0, max = 0;
        for (int g : gain)
            max = Math.max(max, sum += g);
        return max;
    }
}