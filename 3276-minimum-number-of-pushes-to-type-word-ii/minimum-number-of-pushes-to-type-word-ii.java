class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        int res = 0;
        int idx = 0;
        for (int i = 25; i >= 0 && freq[i] > 0; i--) {
            int pushes = idx / 8 + 1;
            res += pushes * freq[i];
            idx++;
        }
        return res;
    }
}