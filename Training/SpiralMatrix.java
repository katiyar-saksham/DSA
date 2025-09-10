public class SpiralMatrix {
    // leetcode 54
    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 },
                { 19, 20, 21, 22, 23, 24 },
                { 25, 26, 27, 28, 29, 30 } };

        // boundaries
        int leftCol = 0, rightCol = nums[0].length - 1;
        int upRow = 0, botRow = nums.length - 1;
        int maxElem = (rightCol + 1) * (botRow + 1);
        int counter = 0;

        while (counter < maxElem) {
            // left to right
            for (int i = leftCol; i <= rightCol && counter < maxElem; i++) {
                System.out.print(nums[upRow][i] + " ");
                counter++;
            }
            upRow++;
            // top to bottom
            for (int i = upRow; i <= botRow && counter < maxElem; i++) {
                System.out.print(nums[i][rightCol] + " ");
                counter++;
            }
            rightCol--;

            // right to left
            for (int i = rightCol; i >= leftCol && counter < maxElem; i--) {
                System.out.print(nums[botRow][i] + " ");
                counter++;
            }
            botRow--;

            // bottom to top
            for (int i = botRow; i >= upRow && counter < maxElem; i--) {
                System.out.print(nums[i][leftCol] + " ");
                counter++;
            }
            leftCol++;
        }
    }
}









// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> result = new ArrayList<>();

//         int top = 0, bottom = matrix.length - 1;
//         int left = 0, right = matrix[0].length - 1;

//         int maxElem = (bottom + 1) * (right + 1);
//         int counter = 0;

//         while (counter < maxElem) {
//             // Traverse left to right
//             for (int i = left; i <= right && counter < maxElem; i++) {
//                 result.add(matrix[top][i]);
//                 counter++;
//             }
//             top++;

//             // Traverse top to bottom
//             for (int i = top; i <= bottom && counter < maxElem; i++) {
//                 result.add(matrix[i][right]);
//                 counter++;
//             }
//             right--;

//             // Traverse right to left
//             for (int i = right; i >= left && counter < maxElem; i--) {
//                 result.add(matrix[bottom][i]);
//                 counter++;
//             }
//             bottom--;

//             // Traverse bottom to top
//             for (int i = bottom; i >= top && counter < maxElem; i--) {
//                 result.add(matrix[i][left]);
//                 counter++;
//             }
//             left++;
//         }

//         return result;
//     }
// }
