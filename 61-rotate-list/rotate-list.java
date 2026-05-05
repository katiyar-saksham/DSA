class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        // Reverse-based approach use karke linked list rotate ki hai (array jaisa concept)
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        k %= len;
        if (k == 0) {
            return head;
        }

        head = reverse(head);

        ListNode first = head;
        ListNode curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        ListNode second = curr.next;
        curr.next = null;

        first = reverse(first);
        second = reverse(second);

        ListNode t = first;
        while (t.next != null)
            t = t.next;
        t.next = second;

        return first;
    }

    private ListNode reverse(ListNode head) {
        ListNode p = null;
        ListNode c = head;

        while (c != null) {
            ListNode n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
}