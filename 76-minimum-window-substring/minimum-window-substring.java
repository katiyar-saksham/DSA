class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        int[] freq = new int[256];
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, count = 0;
        int minLen = Integer.MAX_VALUE, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (freq[ch] > 0) {
                count++;
            }
            freq[ch]--;

            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                freq[leftChar]++;

                if (freq[leftChar] > 0) {
                    count--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}