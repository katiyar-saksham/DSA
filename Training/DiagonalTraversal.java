import java.util.ArrayList;
import java.util.List;

public class DiagonalTraversal {
    public static List<Integer> diagonalTraversal(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        List<Integer> result = new ArrayList<>();

        // Traverse the matrix diagonally
        for (int d = 0; d < rows + cols - 1; d++) {
            int r = d < cols ? 0 : d - cols + 1;
            int c = d < cols ? d : cols - 1;

            while (r < rows && c >= 0) {
                result.add(nums[r][c]);
                r++;
                c--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 },
                { 19, 20, 21, 22, 23, 24 },
                { 25, 26, 27, 28, 29, 30 } };

        List<Integer> result = diagonalTraversal(nums);

        // Print the diagonal traversal
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

