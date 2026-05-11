class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for (int num : nums) {
            String s = String.valueOf(num);

            for (char ch : s.toCharArray()) {
                lst.add(ch - '0');
            }
        }

        int[] res = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            res[i] = lst.get(i);
        }
        return res;
    }
}