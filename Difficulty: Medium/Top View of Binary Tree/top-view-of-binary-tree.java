class Pair {
	int hd;
	Node node;
	
	Pair(Node node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}

class Solution {
	public ArrayList<Integer> topView(Node root) {
		// code here
		ArrayList<Integer> lst = new ArrayList<>();
		
		if (root == null) {
			return lst;
		}
		
		TreeMap<Integer, Integer> mpp = new TreeMap<>();
		
		Queue<Pair> q = new LinkedList<>();
		q.offer(new Pair(root, 0));
		
		while (!q.isEmpty()) {
			Pair p = q.poll();
			
			Node curr = p.node;
			int hd = p.hd;
			
			if (!mpp.containsKey(hd)) {
				mpp.put(hd, curr.data);
			}
			
			if (curr.left != null) {
				q.offer(new Pair(curr.left, hd - 1));
			}
			if (curr.right != null) {
				q.offer(new Pair(curr.right, hd + 1));
			}
		}
		for (int val : mpp.values()) {
			lst.add(val);
		}
		
		return lst;
	}
}
