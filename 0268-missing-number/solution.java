class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int sum=0;
        int n=(nums.length*(nums.length+1))/2;
        while(i<nums.length){
           sum+=nums[i];
           i++;
            }
        if(sum==n){
            return 0;
        }
        else{
            return (n-sum);
        }
        
    }
}
