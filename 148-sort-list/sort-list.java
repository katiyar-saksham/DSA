class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null /*odd*/ && fast.next.next != null /*even*/) {
            slow = slow.next;//left middle hai
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null; //LL break

        head = sortList(head);
        head2 = sortList(head2);
        return mergeTwoLists(head, head2);
    }

    public ListNode mergeTwoLists(ListNode t1, ListNode t2) {

        ListNode dm = new ListNode(0);
        ListNode temp = dm;

        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                temp.next = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if (t1 == null) {
            temp.next = t2;
        } else {
            temp.next = t1;
        }
        return dm.next;
    }
}