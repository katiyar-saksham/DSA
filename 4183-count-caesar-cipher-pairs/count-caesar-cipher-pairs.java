class Solution {
    public long countPairs(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        long pairs = 0;

        for (String word : words) {
            char base = word.charAt(0);
            StringBuilder pattern = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                int diff = (word.charAt(i) - base + 26) % 26;
                pattern.append(diff).append("#");
            }

            String key = pattern.toString();
            pairs += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return pairs;
    }
}