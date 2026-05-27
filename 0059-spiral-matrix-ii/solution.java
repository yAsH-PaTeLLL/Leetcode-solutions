class Solution {

    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;

        int left = 0;
        int right = n - 1;

        int m = 1;

        while (top <= bottom && left <= right) {

            // LEFT -> RIGHT
            for (int j = left; j <= right; j++) {
                matrix[top][j] = m;
                m++;
            }

            top++;

            // TOP -> BOTTOM
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = m;
                m++;
            }

            right--;

            // RIGHT -> LEFT
            if (top <= bottom) {

                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = m;
                    m++;
                }

                bottom--;
            }

            // BOTTOM -> TOP
            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = m;
                    m++;
                }

                left++;
            }
        }

        return matrix;
    }
}
