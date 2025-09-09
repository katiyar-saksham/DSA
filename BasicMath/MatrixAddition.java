import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows"); // rows inpout
        int r = sc.nextInt();
        System.out.println("Enter no. of Columns"); // columns input
        int c = sc.nextInt();

        // Input elements for first matrix
        System.out.println("Enter " + r * c + " elements for 1st Matrix:");
        int[][] Matrix1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter elem at position(" + i + "," + j + ")");
                Matrix1[i][j] = sc.nextInt();
            }
        }

        // Second Matrix Elements Input
        System.out.println("Enter " + r * c + " elements for 2nd Matrix:");
        int[][] Matrix2 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter elem at position(" + i + "," + j + ")");
                Matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }

        // Displaying the Resultant Matrix
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
