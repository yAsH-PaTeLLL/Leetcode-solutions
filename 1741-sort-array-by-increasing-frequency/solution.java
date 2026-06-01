class Solution {
    public int[] frequencySort(int[] nums) {
        int[] freq=new int[211];
        for(int num:nums){
            freq[num+100]++;
        }
        int k=0;
        int i=0;
        int[] arr = new int[nums.length];
        
        while(i<nums.length){
            int max=201;
            for(int j=freq.length-1;j>=0;j--){
                if(freq[j]!=0 && freq[j]<max){
                    max=freq[j];
                    k=j;
                }
                
            }
            while(freq[k]!=0){
                    arr[i]=k-100;
                    i++;
                    freq[k]--;
                }
        }
    return arr;
    }
}
