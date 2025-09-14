public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentProduct = 1;
            for (int j = i; j < nums.length; j++) {
                currentProduct *= nums[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 3, -2, 4, 10, 3 };
        System.out.println("Maximum Product Subarray: " + maxProduct(nums));
    }
}
