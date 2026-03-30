class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        if(q.isEmpty())return;
        
        int val = q.remove();
        reverseQueue(q);
        q.add(val);
    }
}