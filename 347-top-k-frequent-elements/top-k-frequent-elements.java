class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //freq map → bucket → reverse traverse → collect k
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

        int idx = 0;
        int[] res = new int[k];
        for (int i = n; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[idx++] = num;
                }
                if (idx == k) {
                    break;
                }
            }
        }
        return res;
    }
}