class Solution {
    public void nextPermutation(int[] nums) {
        int max=0;
        int index=0;
        boolean swapped=false;
        for(int i=nums.length-1;i>0;i--){
            int idx=min(i,nums.length,nums,nums[i-1]);
            if(idx!=-1){
               int  temp=nums[idx];
                nums[idx]=nums[i-1];
                nums[i-1]=temp;
                Arrays.sort(nums, i, nums.length);
                swapped=true;
                break;
            }
          

    }
     if(!swapped){
            Arrays.sort(nums);
            
           }
        }
    static int min(int start,int end,int[] arr,int target){
        int j=-1;
        int min=Integer.MAX_VALUE;
        for(int i=start;i<end;i++){
            if(arr[i]>target && arr[i]<min){
                min=arr[i];
                j=i;
            }}
        return j;
        }
}
