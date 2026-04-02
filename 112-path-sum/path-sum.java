class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        //leaf node k liye i.e. path leaf node pr hi khtm hona chiye as "root-to-leaf path" given h
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }
}

// if (null) return false;
// if (leaf) check condition;

// return left || right;