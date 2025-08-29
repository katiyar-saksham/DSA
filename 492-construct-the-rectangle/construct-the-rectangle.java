class Solution {
    public int[] constructRectangle(int area) {
        int minDiff = Integer.MAX_VALUE;
        int[] res = new int[2];

        for (int W = 1; W <= area; W++) {
            if (area % W == 0) {
                int L = area / W;
                if (L >= W && (L - W) < minDiff) {
                    res[0] = L;
                    res[1] = W;
                    minDiff = L - W;
                }
            }
        }
        return res;
    }
}