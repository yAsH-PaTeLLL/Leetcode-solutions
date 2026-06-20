class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,target,0,nums.length-1);

    }
    static int binary(int[] nums, int target,int start, int end){
        if(nums[start]>nums[end]){
            return -1;
        }
        int mid=start +(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if((nums[mid]>target) && (mid!=0)){
            return binary(nums,target,start,mid-1);
                    }
        if((nums[mid]<target) && (mid!=nums.length-1)){
            return binary(nums,target,mid+1,end);
        }
     return -1;
     }
}
