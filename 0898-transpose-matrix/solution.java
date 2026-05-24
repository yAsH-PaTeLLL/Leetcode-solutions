class Solution {
    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] ans = new int[cols][rows];

        for (int i = 0; i < rows; i++) {

            int[] currentRow = matrix[i];

            for (int j = 0; j < cols; j++) {
                ans[j][i] = currentRow[j];
            }
        }

        return ans;
    }
}
