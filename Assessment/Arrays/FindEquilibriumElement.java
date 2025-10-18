package Arrays;
public class FindEquilibriumElement {

    public static int findEquilibriumElement(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, -4, 3, 2, 1 };
        int result = findEquilibriumElement(nums);
        System.out.println(result);
    }
}