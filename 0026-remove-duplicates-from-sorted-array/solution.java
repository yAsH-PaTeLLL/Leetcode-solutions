class Solution {
    public int removeDuplicates(int[] nums) {
        int x=nums[0];
        int k=1;
         for(int i=0;i<nums.length;i++){ 
            if(nums[i]!=x){
               nums[k]=nums[i];
                k++;
                x=nums[i];
            }
         }
    return k;
    }
}
