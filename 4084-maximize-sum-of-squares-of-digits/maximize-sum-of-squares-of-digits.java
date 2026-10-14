class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();

        while (num > 0 && sum > 0) {
            int dgt = Math.min(9, sum);
            sb.append(dgt);
            sum -= dgt;
            num--;
        }

        while (num > 0) {
            sb.append(0);
            num--;
        }

        return sum == 0 ? sb.toString() : "";
    }
}