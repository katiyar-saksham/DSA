class Solution {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {

        ListNode t1 = h1;
        ListNode t2 = h2;
        ListNode dm = new ListNode(0);
        ListNode temp = dm;

        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                temp.next = t1;
                t1 = t1.next;
                temp = temp.next;
            } else {
                temp.next = t2;
                t2 = t2.next;
                temp = temp.next;
            }
        }
        if (t1 == null) {
            temp.next = t2;
        } else {
            temp.next = t1;
        }
        return dm.next;
    }
}