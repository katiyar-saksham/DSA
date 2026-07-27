import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows"); // rows input
        int r1 = sc.nextInt();
        System.out.println("Enter no. of Columns"); // columns input
        int c1 = sc.nextInt();

        System.out.println("Enter no. of rows for second matrix"); // rows input
        int r2 = sc.nextInt();
        System.out.println("Enter no. of Columns for second matrix"); // columns input
        int c2 = sc.nextInt();

        if (r1 != r2 || c1 != c2) {
            System.out.println("Matrix addition not possible");
            sc.close();
            return;
        }

        // Input elements for first matrix
        System.out.println("Enter " + r1 * c1 + " elements for 1st Matrix:");
        int[][] Matrix1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Enter elem at position(" + i + "," + j + ")");
                Matrix1[i][j] = sc.nextInt();
            }
        }

        // Second Matrix Elements Input
        System.out.println("Enter " + r2 * c2 + " elements for 2nd Matrix:");
        int[][] Matrix2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println("Enter elem at position(" + i + "," + j + ")");
                Matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        int[][] result = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                result[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }

        // Displaying the Resultant Matrix
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

