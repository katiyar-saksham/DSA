class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();

        generate(lst, 0, 0, n, "");
        return lst;
    }

    private void generate(List<String> lst, int left, int right, int n, String ans) {
        if (ans.length() == 2 * n) {
            lst.add(ans);
            return;
        }
        if (left < n) {
            generate(lst, left + 1, right, n, ans + "(");
        }
        if (right < left) {
            generate(lst, left, right + 1, n, ans + ")");
        }
    }
}