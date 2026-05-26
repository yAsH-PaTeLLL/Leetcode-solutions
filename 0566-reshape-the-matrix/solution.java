class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr= new int[r][c];
        ArrayList<Integer> list = new ArrayList<>();
        if(mat.length==r && mat[0].length==c){
            return mat;
        }
        if(mat.length*mat[0].length != r*c){
            return mat;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                       list.add(mat[i][j]);
            }
        }
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=list.get(k);
                k++;
            }
        }

    return arr;
    }
}
