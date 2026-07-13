class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 9; i++) {
            q.offer(i);
        }

        while (!q.isEmpty()) {
            int num = q.poll();

            if (num >= low && num <= high) {
                res.add(num);
            }

            int dgt = num % 10;

            if (dgt < 9) {
                int next = num * 10 + (dgt + 1);
                if (next <= high) {
                    q.offer(next);
                }
            }
        }
        // Collections.sort(res);
        return res;
    }
}