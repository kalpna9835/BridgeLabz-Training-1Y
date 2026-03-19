class MatrixAdvancedOperations {

    // Create random matrix
    public static double[][] createMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10) + 1;
            }
        }
        return matrix;
    }

    // Display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Transpose of matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {

        double det =
                m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1]) -
                m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0]) +
                m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        return det;
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {

        double det = determinant2x2(m);

        double[][] inv = new double[2][2];

        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    public static void main(String[] args) {

        double[][] matrix2 = createMatrix(2,2);

        System.out.println("Matrix (2x2):");
        displayMatrix(matrix2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix2));

        double det2 = determinant2x2(matrix2);
        System.out.println("\nDeterminant (2x2): " + det2);

        System.out.println("\nInverse (2x2):");
        displayMatrix(inverse2x2(matrix2));

        // 3x3 Example
        double[][] matrix3 = createMatrix(3,3);

        System.out.println("\nMatrix (3x3):");
        displayMatrix(matrix3);

        double det3 = determinant3x3(matrix3);
        System.out.println("\nDeterminant (3x3): " + det3);
    }
}
