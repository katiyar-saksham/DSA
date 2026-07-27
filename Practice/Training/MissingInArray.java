public class MissingInArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int n = nums.length + 1;
        int missingNum = findMissingNums(nums, n);
        System.out.println("The missing number is: " + missingNum);
    }

    public static int findMissingNums(int[] nums, int n) {
        int OgSum = (n * (n + 1)) / 2;
        int arrSum = getArraySum(nums);
        return OgSum - arrSum;
    }

    public static int getArraySum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
