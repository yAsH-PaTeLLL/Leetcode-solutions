class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;

        int top = 0;
        int left = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (right >= left && bottom >= top) {

            int i = top;
            int j = left;

            // left -> right
            while (j <= right) {
                list.add(matrix[i][j]);
                j++;
            }

            j--;
            i++;

            // top -> bottom
            while (i <= bottom) {
                list.add(matrix[i][j]);
                i++;
            }

            i--;
            j--;

            // right -> left
            if (top < bottom) {
                while (j >= left) {
                    list.add(matrix[i][j]);
                    j--;
                }
            }

            j++;
            i--;

            // bottom -> top
            if (left < right) {
                while (i > top) {
                    list.add(matrix[i][j]);
                    i--;
                }
            }

            top++;
            bottom--;
            left++;
            right--;
        }

        return list;
    }
}
