class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < matrix.length) {

            int min = 100000;
            int cols = 0;

            // find row minimum
            for (int j = 0; j < matrix[0].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    cols = j;
                }
            }

            boolean isLucky = true;

            // check column maximum condition
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][cols] > min) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                list.add(min);
            }

            i++;
        }

        return list;
    }
}
