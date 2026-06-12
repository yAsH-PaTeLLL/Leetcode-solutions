class Solution {
    public int[] sortByBits(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            boolean swapped=true;
            for(int j=1;j<arr.length-i;j++){
                if(Integer.bitCount(arr[j])<Integer.bitCount(arr[j-1])){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=false;
                }
                else if( (Integer.bitCount(arr[j])==Integer.bitCount(arr[j-1])) && (arr[j]<arr[j-1])){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=false;
                }
            }
            if(swapped){
                break;
            }
        }
    return arr;
    }
}
