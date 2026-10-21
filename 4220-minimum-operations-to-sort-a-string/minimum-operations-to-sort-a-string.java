class Solution {
    public int minOperations(String s) {
        int n = s.length();

        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;
        if (n == 2) return -1;

        char first = s.charAt(0);
        char last = s.charAt(n - 1);

        char min = 'z', max = 'a';
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c < min) min = c;
            if (c > max) max = c;
        }

        if (first == min || last == max) return 1;
        
        boolean firstStrictMax = true, lastStrictMin = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) >= first) firstStrictMax = false;
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) <= last) lastStrictMin = false;
        }
        if (firstStrictMax && lastStrictMin) return 3;

        return 2;
    }
}