class Solution {
    
    public boolean exist(char[][] board, String word) {
    boolean[][] arr=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && seq(arr,board,word,i,j,0)){
                    return true;
                }
            }
        }
    return false;
    }
    static boolean seq(boolean[][] arr,char[][] board,String word,int r,int c,int index){
        if(index==word.length()-1){
            return true;
        }
       
       arr[r][c]=true;
        
        if((r+1< board.length) && (arr[r+1][c]==false) && (board[r+1][c]==word.charAt(index+1)) && seq(arr,board,word,r+1,c,index+1)){
              return true  ;
            }
        if((r-1>=0) && (arr[r-1][c]==false) && (board[r-1][c]==word.charAt(index+1)) && seq(arr,board,word,r-1,c,index+1)){
              return true  ;
            }
        if((c+1< board[0].length) && (arr[r][c+1]==false) && (board[r][c+1]==word.charAt(index+1)) && seq(arr,board,word,r,c+1,index+1)){
            return true  ;
        }
        if((c-1>=0) && (arr[r][c-1]==false) && (board[r][c-1]==word.charAt(index+1)) && seq(arr,board,word,r,c-1,index+1)){
            return true  ;
        }
        arr[r][c]=false;
        return false;
   
    }
}
