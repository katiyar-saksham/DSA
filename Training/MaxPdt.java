public class MaxPdt {
    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int pdt = 1;
            for (int j = i; j < nums.length; j++) {
                pdt *= nums[j];
                maxProduct = Math.max(maxProduct, pdt);
            }
        }

        System.out.printf("Maximum product of subarray is: %d%n", maxProduct);
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -2, 10, 4, 2};
        maxProduct(arr);
    }
}
