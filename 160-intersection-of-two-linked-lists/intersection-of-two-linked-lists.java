public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lenA = 0, lenB = 0;

        while (tempA != null || tempB != null) {
            if (tempA != null) {
                lenA++;
                tempA = tempA.next;
            }
            if (tempB != null) {
                lenB++;
                tempB = tempB.next;
            }
        }
        tempA = headA;
        tempB = headB;
        int n = Math.abs(lenA - lenB);

        for (int i = 0; i < n; i++) {
            if (lenA > lenB) {
                tempA = tempA.next;
            } else {
                tempB = tempB.next;
            }
        }
        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }
}