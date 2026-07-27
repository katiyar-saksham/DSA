class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        int x = 1;
        while (x < n && x > 0) {
            x <<= 1;
        }
        return x == n;
    }
}