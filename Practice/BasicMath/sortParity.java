/**
 * Problem Statement: 
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 * 
 * Concept:
 * The concept used here is two pointers technique. 
 * We initialize two pointers, left and right, to the start and end of the array respectively.
 * Then we traverse the array from left to right and if the element at the left pointer is even, we increment the left pointer.
 * If the element at the left pointer is odd, we swap it with the element at the right pointer and decrement the right pointer.
 * We repeat this process until the left pointer is greater than the right pointer.
 * At the end, all the even numbers will be on the left side of the array and all the odd numbers will be on the right side.
 */

public class sortParity {
    public static int[] sortArrayByParity(int[] A) {
        int left = 0, right = A.length - 1;
        
        while (left < right) {
            if (A[left] % 2 == 0) {
                left++;
            } else {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                right--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 4, 12, 2, 2, 56, 6, 0};
        int[] result = sortArrayByParity(A);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
