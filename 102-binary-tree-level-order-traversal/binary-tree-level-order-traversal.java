class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int sz = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < sz; i++) {
                TreeNode front = q.remove();
                level.add(front.val);

                if (front.left != null) {
                    q.add(front.left);
                }
                if (front.right != null) {
                    q.add(front.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}