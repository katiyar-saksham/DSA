class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = slow.next;
        slow.next = null;

        ListNode prev = null;
        while (fast != null) {
            ListNode nxt = fast.next;
            fast.next = prev;
            prev = fast;
            fast = nxt;
        } // abb prev is head of 2nd LL i.e. 2nd half

        while (prev != null) {//cause 2nd half is always smaller or equal.
            if (prev.val != head.val) {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }

        return true;
    }
}