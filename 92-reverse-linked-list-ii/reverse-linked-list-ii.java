class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dm = new ListNode(0);
        dm.next = head;
        ListNode prev = dm;
        ListNode curr = head;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode start = prev.next;
        // prev.next = null;
        ListNode end = start;

        for (int i = left; i < right; i++) {
            end = end.next;
        }

        ListNode h3 = end.next;
        end.next = null;

        ListNode tail = start; // save old start (future tail)
        start = reverseList(start);

        prev.next = start;
        tail.next = h3;

        return dm.next;
    }

    ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = null;

        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }
}