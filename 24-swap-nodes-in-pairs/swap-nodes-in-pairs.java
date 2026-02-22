class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dm = new ListNode(0);
        dm.next = head;
        ListNode prev = dm;
        ListNode curr = head;
        ListNode fwd = null;

        while (curr != null && curr.next != null) {
            fwd = curr.next;

            curr.next = fwd.next;
            fwd.next = curr;
            prev.next = fwd;

            prev = curr;
            curr = curr.next;
        }
        return dm.next; 
    }
}