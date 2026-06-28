class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return sum(nums,target,0,0,0);
    }
    static int sum(int[] nums,int target,int sum,int index,int count){
        if(index==nums.length){
            if(sum==target){
            return 1;}
            else{return 0;}
        }
    int i=nums[index];
    int left=sum(nums,target,sum+i,index+1,count);
    int right=sum(nums,target,sum-i,index+1,count);
     return left+right;

    }

}
