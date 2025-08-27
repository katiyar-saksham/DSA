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
