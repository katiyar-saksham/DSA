class Solution {
    public boolean isBalanced(TreeNode root) {
        return levels(root) != -1;
    }

    private int levels(TreeNode root){
        if(root == null) return 0;

        int left = levels(root.left);
        if (left == -1) return -1;
        
        int right = levels(root.right);
        if (right == -1) return -1;

        if(Math.abs(right-left)>1)return -1;

        return Math.max(left,right)+1;
    }
}