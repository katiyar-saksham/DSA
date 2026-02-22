class Solution {
    public int pairSum(ListNode head) {

        int MAX = Integer.MIN_VALUE;

        // Safety check
        if (head == null || head.next == null)
            return 0;

        ListNode slow = head;
        ListNode fast = head;

        // first half find karo
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // second half start
        fast = slow.next;
        slow.next = null; // break into 2 halves

        // reverse 2nd half
        ListNode prev = null;

        while (fast != null) {
            ListNode nxt = fast.next;
            fast.next = prev;
            prev = fast;
            fast = nxt;
        }

        // compare twin sum
        while (prev != null) {
            int sum = head.val + prev.val;

            if (sum > MAX) {
                MAX = sum;
            }

            head = head.next;
            prev = prev.next;
        }

        return MAX;
    }
}