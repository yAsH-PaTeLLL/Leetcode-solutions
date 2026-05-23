class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        int i = 0;

        // Cyclic Sort
        while(i < nums.length) {

            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            }
            else {

                i++;
            }
        }

      

        // Find duplicates
        for(i = 0; i < nums.length; i++) {

            if(nums[i] != i + 1) {

                arr[0]=(nums[i]);
                arr[1]=i+1;

            }
        }

    return arr;}
}
