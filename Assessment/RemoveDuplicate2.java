public class RemoveDuplicate2 {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 3, 3, 4, 4, 5 };
        int k = 2;

        int newLength = removeDuplicates(nums, k);

        // Option 1: Pretty one-liner
        // System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, newLength)));

        // Option 2: Simple helper method
        printArray(nums, newLength);
    }

    public static int removeDuplicates(int[] nums, int k) {
        if (nums.length <= k)
            return nums.length;

        int i = k; // write pointer

        for (int j = k; j < nums.length; j++) {
            if (nums[j] != nums[i - k]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void printArray(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
