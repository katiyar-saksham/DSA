class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();

        for (String s : strs) {
            int[] arr = new int[26];

            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int a : arr) {
                sb.append('#').append(a);
            }

            String key = sb.toString();

            if (!mpp.containsKey(key)) {
                mpp.put(key, new ArrayList<>());
            }
            mpp.get(key).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}