class Solution {
    public boolean checkOnesSegment(String s) {
        int count=1;
       if(s.length()==1){
            if(s.charAt(0)=='1'){
                return true;
            }
            else{
                return false;
            }
       } 
       int i=1;
       while(i<s.length()) {
        if(s.charAt(i)=='1' && s.charAt(i-1)!='1'){
            return false;
            
        }
        else{
            i++;
        }
        
       }
   
    return true;
    }
}
