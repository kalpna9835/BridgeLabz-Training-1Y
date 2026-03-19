class MatrixOperations {

    // Create random matrix
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // 0–9
            }
        }
        return matrix;
    }

    // Add two matrices
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Subtract two matrices
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Multiply two matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = B[0].length;
        int common = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] A = createMatrix(2, 2);
        int[][] B = createMatrix(2, 2);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nAddition:");
        displayMatrix(addMatrix(A, B));

        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrix(A, B));

        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrix(A, B));
    }
}
