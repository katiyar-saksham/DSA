/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	
	Node(int val) {
		data = val;
		left = right = null;
	}
} */

class Solution {
	public int height(Node root) {
		// code here
		if (root == null) {
			return -1;
		}
		
		int Lht = height(root.left);
		int Rht = height(root.right);
		
		return Math.max(Lht, Rht)+1;
	}
}
