class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int one = 0, zero = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                one++;
            } else {
                zero++;
            }
        }

        int ans = Math.min(one, zero);

        if (one <= 1 || one == 0 || zero == 0) {
            return 0;
        } else {
            if (s.charAt(0) == '1' && s.charAt(n - 1) == '1') {
                if (one == 2)
                    return 0;
                else
                    return Math.min(one - 2, zero);
            }
        }
        return Math.min(zero, one - 1);
        // if (s.charAt(0) == '1' && s.charAt(n - 1) == '1' && zero == n - 2) {
        //     return 0;
        // }

        // return Math.min(one - 1, zero);
    }
}