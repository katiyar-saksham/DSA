import java.util.*;

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
}