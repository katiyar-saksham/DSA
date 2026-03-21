class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 1) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            // ✅ update AFTER window is valid
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}