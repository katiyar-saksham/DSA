/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }
    
    private void helper(Node node, ArrayList<Integer> result) {
        if (node == null) return;
        
        helper(node.left, result);
        helper(node.right, result);
        result.add(node.data);
    }
}