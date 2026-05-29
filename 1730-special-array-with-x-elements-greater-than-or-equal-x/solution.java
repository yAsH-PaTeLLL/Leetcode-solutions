class Solution {
    public int specialArray(int[] nums) {
        int count =0;
        for(int i=nums.length;i>0;i--)
        {
            if(count(nums,i)){
                return i;
            }
        }
    return -1;}
    static boolean count(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                count++;
            }
        
        }
        if(count==target){
            return true;}
    return false;
    }
}
