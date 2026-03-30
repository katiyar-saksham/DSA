class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        int n = q.size();
        Queue<Integer> qq = new LinkedList<>();

        for(int i=0;i<n/2;i++){
            qq.add(q.remove());
        }
        for(int i=0;i<n/2;i++){
            q.add(qq.remove());
            q.add(q.remove());
        }
    }
}