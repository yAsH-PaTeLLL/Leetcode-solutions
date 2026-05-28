class Solution {
    public int countNegatives(int[][] grid) {
        int totalcount=0;
        for(int[] arr:grid){
            totalcount+=count(arr);
        }
    return totalcount;
    }

    static int count(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=0){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    return arr.length-1-end;
    } 
}
 
