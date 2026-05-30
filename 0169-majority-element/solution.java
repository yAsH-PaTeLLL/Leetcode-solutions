class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean swapped=false;
            for(int j=1;j<nums.length-i;j++){
                    if(nums[j]<nums[j-1]){
                        int temp=nums[j];
                        nums[j]=nums[j-1];
                        nums[j-1]=temp;
                        swapped=true;
                    }
            }
            if(!swapped){
                break;
            }
        }
    int count=0;
    int element=nums[0];
    for(int i=0;i<nums.length;i++){
        if(nums[i]==element){
            count++;
            if(count>(nums.length/2)){
                return nums[i];
            }
        }
        else{
            element =nums[i];
            count=1;
        }
    }
    return -1;
    }

}
