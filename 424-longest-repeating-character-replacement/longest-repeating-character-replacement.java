class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> mpp = new HashMap<>();
        int ans = 0;
        int left = 0;
        int maxFreq = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, mpp.get(ch));

            // How many characters are NOT the dominant character
                // window size - maxFreq ?
            while ((i - left + 1) - maxFreq > k) {
                char rem = s.charAt(left);
                mpp.put(rem, mpp.get(rem) - 1);
                if (mpp.get(rem) == 0) {
                    mpp.remove(rem);
                }
                left++;
            }

            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}