class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n < 3) {
            return n;
        }
        int m = 0;
        while (Math.pow(2, m) <= n) {
            m++;
        }
        return (int) Math.pow(2, m);
    }
}