class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l = 0, r = 1;

        while (l < nums.length && r < nums.length) {
            if (nums[l] % 2 == 0) {
                l += 2;
            } else if (nums[r] % 2 != 0) {
                r += 2;
            } else {
                swap(nums, l, r);
                l += 2;
                r += 2;
            }
        }
        return nums;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}