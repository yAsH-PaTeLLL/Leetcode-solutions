class Solution {
    public int maximumProduct(int[] nums) {
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        int t=Integer.MIN_VALUE;
        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;

        for(int num:nums){
            if(num>f){
                t=s;
                s=f;
                f=num;
            }
            else if(num>s){
                t=s;
                s=num;
            }
            else if(num>t){
            t=num;
            }
            if(num<i){
                j=i;
                i=num;

            }
            else if(num<j){
                j=num;
            }
        }
    return Math.max((t*s*f),(f*i*j));
    }
}
