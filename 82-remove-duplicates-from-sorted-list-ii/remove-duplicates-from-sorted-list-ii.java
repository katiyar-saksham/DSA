class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dm = new ListNode(0);

        ListNode t = dm;
        ListNode i = head;

        while (i != null) {
            if (i.next != null && i.val == i.next.val) {
                while (i.next != null && i.val == i.next.val) {
                    i = i.next;
                }
                i = i.next;
            } else {
                t.next = i;
                t = t.next;
                i = i.next;
            }
        }
        t.next = null;
        return dm.next;
    }
}
