class Solution {

    public int oddCells(int m, int n, int[][] indices) {

        int[][] arr = new int[m][n];

        for(int i = 0; i < indices.length; i++) {

            
                int row = arr.length;
                int col = arr[0].length;
                int x = indices[i][0];
                int y = indices[i][1];
                while(col > 0) {   
                    arr[x][col - 1]++;
                    col--;
                }
                while(row > 0) {
                    arr[row - 1][y]++;
                    row--;
                }
            
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
