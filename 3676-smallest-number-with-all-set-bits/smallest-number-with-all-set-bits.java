class Solution {
    public int smallestNumber(int n) {
        int res = 0;
        while (res < n) {
            res = 2 * res + 1; // this gives no. like 1,3,7,15... (2^n -1) wle no milege
        }
        return res;
    }
}