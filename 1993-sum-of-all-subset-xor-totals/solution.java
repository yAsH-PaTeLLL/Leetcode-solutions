class Solution {
    public int subsetXORSum(int[] nums) {
        
        int sum=0;
        sum=subset(nums,0,0);
    return sum;
    }
    static int subset(int[] up,int index,int sum){
        if(index==up.length){
            return sum;
        }
        
        int left=  subset(up,index+1,sum^up[index]);
        int right = subset(up,index+1,sum);
        
    return left+right;
    }

   
}
