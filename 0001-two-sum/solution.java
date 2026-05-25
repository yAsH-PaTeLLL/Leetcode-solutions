class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=0;
    while (j<nums.length-1){    
        for(int i=j+1;i<nums.length;i++){
                if(nums[j]+nums[i]==target){
                    return new int[]{j,i};
                }
                
        }
        j++;
    }
    return new int[2];
    }
}
