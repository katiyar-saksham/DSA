class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return check(root) != -1;
        
    }
    private int check(Node root){
        if(root==null)return 0;
        
        int left = check(root.left);
        if(left==-1)return -1;
        
        int right = check(root.right);
        if(right==-1)return -1;
        
        if(Math.abs(right-left)>1)return -1;
        
        return 1+ Math.max(right,left);
    }
} 