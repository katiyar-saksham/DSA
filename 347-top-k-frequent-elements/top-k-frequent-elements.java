class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[n + 1];

        for (int key : mpp.keySet()) {
            int freq = mpp.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int idx = 0;

        for (int i = n; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[idx++] = num;
                    if (idx == k)
                        break;
                }
            }
        }
        return res;
    }
}