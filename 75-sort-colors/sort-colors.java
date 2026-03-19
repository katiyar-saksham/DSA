class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int m = l;

        while (m <= r) {
            if (nums[m] == 0) {
                swap(nums, m, l);
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                swap(nums, m, r);
                r--;
            }
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}