class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();

        if (words.length == 0)
            return result;

        result.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i], result.get(result.size() - 1))) {
                result.add(words[i]);
            }
        }

        return result;
    }

    //helper fn
    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26]; //small alphabets == 26 hai

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; //ex: 'c' - 'a' = 99 - 97 = 2 → this maps 'c' to index 2.
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0)
                return false;
        }

        return true;
    }
}