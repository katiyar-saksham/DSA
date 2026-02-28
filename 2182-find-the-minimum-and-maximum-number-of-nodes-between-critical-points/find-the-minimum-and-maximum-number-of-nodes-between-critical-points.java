class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        // agar 3 se kam nodes hain to critical point possible nahi
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        ListNode prev = head;
        ListNode curr = head.next;
        int idx = 1;  // curr index 1 pe hai (head index 0 hai) as idx 0 ya n kabhi critical pt nhi ho skte

        int first = -1; /// store idx for first existing CP
        int last = -1; //stores idx of latest CP found
        int minDist = Integer.MAX_VALUE;

        while (curr.next != null) {
            ListNode next = curr.next;

            // check kar rahe hain ki curr critical point hai ya nahi
            // ya to peak hoga ya kmm hoga
            if ((prev.val < curr.val && curr.val > next.val) ||
                (prev.val > curr.val && curr.val < next.val)) {

                if (first == -1) {
                    first = idx;   // pehla critical point fix ho gaya (max distance ke liye)
                } if(last!=-1) {
                    minDist = Math.min(minDist, idx - last);  // consecutive CP ke beech min distance
                }

                last = idx;
            }

            prev = curr;
            curr = next;
            idx++;
        }

        // agar 2 se kam critical points mile to answer -1 -1
        if (first == -1 || first == last) {
            return new int[]{-1, -1};
        }

        return new int[]{minDist, last - first}; //last - first for MAX Distance
    }
}