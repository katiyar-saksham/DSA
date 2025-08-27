public class sortParity {
    public static int[] sortArrayByParity(int[] A) {
        int nextEven = 0, nextOdd = A.length - 1;
        while (nextEven < nextOdd) {
            if (A[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = A[nextEven];
                A[nextEven] = A[nextOdd];
                A[nextOdd--] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 4, 12, 2, 2, 56, 6, 0};
        int[] result = sortArrayByParity(A);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

