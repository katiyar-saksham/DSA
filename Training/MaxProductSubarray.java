import java.util.Arrays;

public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int currentProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            currentProduct *= nums[i];
            maxProduct = Math.max(maxProduct, currentProduct);
            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3,3, -2, 4 ,2,10};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums));
    }
}

