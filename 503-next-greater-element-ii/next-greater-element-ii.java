class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] num = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            num[i] = nums[i];
            num[i + nums.length] = nums[i];
        }

        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums.length];

        for (int i = num.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && num[i] >= st.peek()) {
                st.pop();
            }

            if (i < nums.length) {
                res[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(num[i]);
        }
        return res;
    }
}