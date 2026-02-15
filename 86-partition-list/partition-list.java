class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode sm = new ListNode(0);
        ListNode t1 = sm;
        ListNode lg = new ListNode(-1);
        ListNode t2 = lg;
        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
                t1.next = temp;
                t1=t1.next;
            } else {
                t2.next = temp;
                t2=t2.next;
            }
            temp = temp.next;
        }
        t2.next=null;
        t1.next=lg.next;
        return sm.next;
    }
}