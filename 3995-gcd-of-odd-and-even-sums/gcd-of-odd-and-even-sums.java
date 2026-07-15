class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        int i = 1;
        while (i <= 2 * n) {
            sumOdd += i++;
            sumEven += i++;
        }
        return gcd(sumOdd, sumEven);
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}