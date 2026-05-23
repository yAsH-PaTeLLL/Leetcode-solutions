class Solution {

    public List<Integer> findDuplicates(int[] nums) {

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

        List<Integer> list = new ArrayList<>();

        // Find duplicates
        for(i = 0; i < nums.length; i++) {

            if(nums[i] != i + 1) {

                list.add(nums[i]);

            }
        }

        return list;
    }
}
