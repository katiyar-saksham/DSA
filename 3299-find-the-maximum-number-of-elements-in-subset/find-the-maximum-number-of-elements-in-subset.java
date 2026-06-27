class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long, Integer> map = new HashMap<>();
        int ans = 1;

        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }
        if (map.containsKey(1L)) {
            int c = map.get(1L);

            if (c % 2 == 0) {
                ans = Math.max(ans, c - 1);
            } else {
                ans = Math.max(ans, c);
            }
        }

        for (long start : map.keySet()) {
            if (start == 1) {
                continue;
            }

            long curr = start;
            int len = 0;

            while (map.containsKey(curr)) {
                if (map.get(curr) >= 2) {
                    len += 2;

                    long next = curr * curr;
                    if (!map.containsKey(next)) {
                        len--;
                        break;
                    }
                    curr = next;
                } else {
                    len++;
                    break;
                }
            }
            ans = Math.max(ans, len);
        }
        return ans;
    }
}