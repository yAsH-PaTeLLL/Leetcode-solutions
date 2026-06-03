class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=m-1;
        int j=n-1;
        int x=nums1.length-1;
        if(m==0){
           for(int k=0;k<n;k++){
            nums1[k]=nums2[k];
                }
        
        }
       while(i>-1 && j>-1) {
        if(nums1[i]>nums2[j]){
            int temp=nums1[i];
            nums1[i]=nums1[x];
            nums1[x]=temp;
            i--;
            x--;
        }
        else{
            nums1[x]=nums2[j];
            x--;
            j--;
        }
        
    }
    while(j >= 0){
    nums1[x] = nums2[j];
    j--;
    x--;
}
}
}
