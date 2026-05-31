class Solution {
    public int[] sortedSquares(int[] nums) {
      int[] arr= new int[nums.length];
      int i=nums.length-1;
      int j=0;
      int k=nums.length-1;
      while(k>=0){
        if(nums[i]*nums[i]>=nums[j]*nums[j]){
                arr[k]=nums[i]*nums[i];
                i--;
                k--;
        }
        else{
              arr[k]=nums[j]*nums[j];
                j++;
                k--;  
        }
      }
       
       
    return arr;
    }
}
