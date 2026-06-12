class Solution {
    public int binaryGap(int n) {
       if(Integer.bitCount(n)==1){
        return 0;
       }
       int max=0;
        int count=0;
        while(n>0){
            count=0;
            if((n & 1) == 1){
                n>>=1;
                count++;
                while(((n&1) !=1)&&(n>0)){
                    count++;
                    n>>=1;
                }
                if(count>max){
                    max=count;
                }
            }
            if((n&1)!=1){
                n>>=1;
            }
        }
    return max;
    }
}
