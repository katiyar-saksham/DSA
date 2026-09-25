class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean LtoR = true;
        while (!q.isEmpty()) {
            int sz = q.size();
            List<Integer> lvl = new ArrayList<>();

            for (int i = 0; i < sz; i++) {
                TreeNode front = q.remove();

                if (LtoR) {
                    lvl.add(front.val);
                } else {
                    lvl.add(0, front.val);
                }

                if (front.left != null) {
                    q.offer(front.left);
                }
                if (front.right != null) {
                    q.offer(front.right);
                }
            }

            LtoR = !LtoR;
            res.add(lvl);
        }
        return res;
    }
}