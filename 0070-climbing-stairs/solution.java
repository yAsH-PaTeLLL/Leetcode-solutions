class Solution {
    public int climbStairs(int n) {
        int[] arr=new int[n+1];
        return stairs(n,arr);
    }
    static int stairs(int up, int[] arr){
        if(up==0){
            return 1;
        }
        if(up<0){
            return 0 ;
        }
        if(arr[up]!=0){
            return arr[up];
        }
            int left = stairs(up-2,arr);
            int right = stairs(up-1,arr);
            arr[up] = left + right;
        
    return arr[up];
    }
}
