import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows of first matrix:");
        int r1 = sc.nextInt();
        System.out.println("Enter columns of first matrix:");
        int c1 = sc.nextInt();

        System.out.println("Enter rows of second matrix:");
        int r2 = sc.nextInt();
        System.out.println("Enter columns of second matrix:");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println(
                    "Matrix multiplication not possible. Columns of first matrix must equal rows of second matrix.");
            sc.close();
            return;
        }

        int[][] Matrix1 = new int[r1][c1];
        System.out.println("Enter " + r1 * c1 + " elements for first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                Matrix1[i][j] = sc.nextInt();
            }
        }

        int[][] Matrix2 = new int[r2][c2];
        System.out.println("Enter " + r2 * c2 + " elements for second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                Matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) {
                    sum += Matrix1[i][k] * Matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }

        System.out.println("Resultant matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
