class Solution {

    static boolean checkZero(int x) {
        while (x > 0) {
            if (x % 10 == 0) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) {

        for (int i = 1; i < n; i++) {
            int a = i, b = n - a;

            if (checkZero(a) && checkZero(b)) {
                return new int[] { a, b };
            }
        }
        return new int[0];
    }
}