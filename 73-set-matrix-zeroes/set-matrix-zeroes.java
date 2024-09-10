class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;    // number of rows
        int n = matrix[0].length; // number of columns

        int[] rowMatrix = new int[m];  // row marker array
        int[] colMatrix = new int[n];  // column marker array

        // Mark the rows and columns that need to be set to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowMatrix[i] = 1;  // mark row
                    colMatrix[j] = 1;  // mark column
                }
            }
        }

        // Set the rows to zero
        for (int i = 0; i < m; i++) {
            if (rowMatrix[i] == 1) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;  // set the entire row to zero
                }
            }
        }

        // Set the columns to zero
        for (int j = 0; j < n; j++) {
            if (colMatrix[j] == 1) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;  // set the entire column to zero
                }
            }
        }
    }
}
