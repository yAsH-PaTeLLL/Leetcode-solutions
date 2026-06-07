class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int x=0;
        int sum=0;
        while(x<=201){
              if(Math.abs(n - x) <= k){
                    if((n & x)==0){
                        sum+=x;
                    }}
                    x++;
        }
    return sum;
    }
}
