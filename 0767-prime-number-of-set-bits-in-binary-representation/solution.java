class Solution {
    public int countPrimeSetBits(int left, int right) {
        int  count=0;

        for(int i=left;i<=right;i++){
            if(isprime(Integer.bitCount(i))){
                count++;
            }
        }
    return count;}
    static boolean isprime(int n){
        if(n==1){
            return false;
        }
        if(n==0){
            return false;
        }
        for(int i=1;i<=Math.sqrt(n);i++){
            if((n%i==0) && i!=1){
                return false;
            }
        }
    return true;
    }
}
