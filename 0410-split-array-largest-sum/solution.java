class Solution {
    public int splitArray(int[] nums, int k) {
       int ans=largestsum(nums,k);
       return ans;
    }
static int largestsum(int[] nums,int k){
    int start=0;
       int end=0;
       for(int i=0;i<nums.length;i++){
            start=Math.max(nums[i],start);
            end=end+nums[i];
       }
       while(start<end){
        int sum=0;
        int pieces=1;
        int mid=start+(end-start)/2;
        for(int i=0;i<nums.length;i++){
            if(sum + nums[i]<=mid){
                sum=sum+nums[i];
            }
            else{
                sum=nums[i];
                pieces++;
            }
        }
        if(pieces<=k){
            end=mid;
        }
        else{
            start=mid+1;
        }}
        

                return end;
                }
}
