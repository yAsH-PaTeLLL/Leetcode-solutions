class Solution {
    public boolean consecutiveSetBits(int n) {
       int count=0;
        while(n!=0){
            if((n&1)==1 && (((n>>1)&1)==1)){
                count++;
                n=n>>1;
            }
            else{
                n=n>>1;
            }
            
            
        }
        if(count==1){
            return true;
        }
    return false;}
}
