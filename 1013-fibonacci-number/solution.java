class Solution {
    public int fib(int n) {
        return sum(n,0);
    }
    static int sum(int n,int summ){
        if(n<2){
            return n;
        }
        summ+=sum(n-1,summ)+sum(n-2,summ);
        return summ;
        
    }
}
