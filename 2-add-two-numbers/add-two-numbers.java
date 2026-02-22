class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode prev = null;

        while (t1 != null || t2 != null) {
            if (t1 == null) { 
                prev.next = new ListNode(0);
                t1 = prev.next;
            }

            if (t2 != null) {
                t1.val = t1.val + t2.val;
            }
            if (t1.val > 9) {
                int quo = t1.val / 10; // carry
                int rem = t1.val % 10; // Remainder

                t1.val = rem;
                if (t1.next != null) {
                    t1.next.val = t1.next.val + quo;
                } else {
                    t1.next = new ListNode(quo);
                }
            }

            prev = t1;
            t1 = t1.next;
            if (t2 != null)
                t2 = t2.next;
        }
        return l1;
    }
}