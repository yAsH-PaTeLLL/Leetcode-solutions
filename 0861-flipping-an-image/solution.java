class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] flip = new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                flip[i][j]=1-image[i][(image.length-1)-j];
               
            }
        }
    return flip;
    }
}
