class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;

        ListNode sm = new ListNode(0);
        ListNode lg = new ListNode(0);
        ListNode t1 = sm;
        ListNode t2 = lg;
        ListNode temp = head;

        while (temp != null) {
            t1.next = temp;
            t1 = t1.next;
            temp = temp.next;
            if (temp != null) {
                t2.next = temp;
                t2 = t2.next;
                temp = temp.next;
            }
        }
        t2.next = null;
        t1.next = lg.next;
        return sm.next;
    }
}