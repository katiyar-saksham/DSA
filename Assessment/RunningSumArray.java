public class RunningSumArray {
    public static int Sum(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res += num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int result = Sum(array);
        System.out.println("The sum of the array elements is: " + result);
        }
}