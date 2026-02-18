class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = null;

        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            // if (nxt != null) {
            //     nxt = nxt.next;
            // }
        }

        return prev;
    }
}