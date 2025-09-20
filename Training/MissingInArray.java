public class MissingInArray {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int n = nums.length + 1;

        int OgSum = (n * (n + 1)) / 2;
        int arrSum = 0;

        for (int num : nums) {
            arrSum += num;
        }
        System.out.println(OgSum - arrSum);
    }
}
