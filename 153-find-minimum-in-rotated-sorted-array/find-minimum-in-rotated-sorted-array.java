class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        // return bs(nums, 0, nums.length - 1);

        // Iterative Binary Search (while loop)
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    // Recursive Binary Search (bs)

    // int bs(int[] nums, int left, int right) {
    //     if (left == right) {
    //         return nums[left];
    //     }

    //     int mid = left + (right - left) / 2;

    //     if (nums[mid] > nums[right]) {
    //         return bs(nums, mid + 1, right);
    //     }
    //     return bs(nums, left, mid);
    // }
}