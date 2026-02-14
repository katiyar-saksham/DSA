/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp1 = head;
        for (int i = 1; i < k; i++) {
            temp1 = temp1.next;
        }

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        swap(temp1, slow);
        return head;
    }

    void swap(ListNode front, ListNode end) {
        int swp = front.val;
        front.val = end.val;
        end.val = swp;
    }
}