class Solution {
    public int scoreOfParentheses(String s) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                v.add(0);
            } else {
                int curr = v.remove(v.size() - 1);

                if (s.charAt(i - 1) == '(') {
                    curr = 1;
                } else {
                    curr = 2 * curr;
                }
                int parent = v.size() - 1;
                v.set(parent, v.get(parent) + curr);
            }
        }
        return v.get(0);
    }
}