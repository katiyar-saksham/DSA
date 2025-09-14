import java.util.*;

public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int pdt = 1;
            for (int j = 0; j < nums.length; j++) {
                pdt *= nums[j];
                maxProduct = Math.max(maxProduct, pdt);
            }
        }
        System.out.println(maxProduct);
        return maxProduct;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, -2, 10 };
        maxProduct(arr);
    }
}