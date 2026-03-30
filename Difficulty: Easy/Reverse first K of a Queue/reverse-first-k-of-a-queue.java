class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (q == null || k <= 0 || k > q.size()) return q;

        int n = q.size();
        
        reverseK(q, k);
        
        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }

        return q;
    }
    
    private void reverseK(Queue<Integer> q, int k) {
        if (k == 0) return;

        int val = q.remove();
        reverseK(q, k - 1);
        q.add(val);
    }
}