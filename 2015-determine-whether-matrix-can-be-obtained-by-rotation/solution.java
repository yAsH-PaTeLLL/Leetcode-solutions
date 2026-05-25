class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

    for(int i=0;i<4;i++){
    if(Arrays.deepEquals(mat,target)){
        return true;
    }
    
        mat=rotate(mat);
    
    }
    return false;}

static int[][] rotate(int[][] mat){
        int[][] rotate=new int[mat.length][mat.length];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                rotate[j][mat.length -1 -i]=mat[i][j];
            }
        }
    return rotate;
    }
    
}
