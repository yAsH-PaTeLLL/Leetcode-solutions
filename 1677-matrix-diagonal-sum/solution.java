class Solution {
    public int diagonalSum(int[][] mat) {
         if(mat.length==1){
            return mat[0][0];
        }
        int sum =0;
        int i=0;
        int j=mat.length-1;
        while(i<mat.length){
            sum+=mat[i][i];
            sum+=mat[i][j];
            i++;
            j--;
        }
       
        if(mat.length%2!=0){
            sum-=mat[(mat.length-1)/2][(mat.length-1)/2];
        }
        

    return sum;
    }
}
