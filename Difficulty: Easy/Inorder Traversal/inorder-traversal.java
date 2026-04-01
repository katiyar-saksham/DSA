/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }
    
    private void helper(Node node, ArrayList<Integer> result) {
        if (node == null) return;
        
        helper(node.left, result);
        result.add(node.data);
        helper(node.right, result);
    }
}