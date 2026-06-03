class Solution {
    public boolean judgeCircle(String moves) {
        int cr=0,cu=0,cd=0,cl=0;
        for(char ch:moves.toCharArray()){
          if(ch=='U'){
            cu++;
          }
          else if(ch=='R'){
            cr++;
          }    
            else if(ch=='L'){
            cl++;
          } 
          else{
            cd++;
          } 

         
        }
         if(cu==cd && cr==cl){
            return true;
          }
    return false;}
}
