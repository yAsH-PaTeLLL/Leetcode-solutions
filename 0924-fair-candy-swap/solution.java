class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1=0;
        for(int i=0;i<aliceSizes.length;i++){
            sum1+=aliceSizes[i];
        }
        int sum2=0;
        for(int j=0;j<bobSizes.length;j++){
            sum2+=bobSizes[j];
        }

        
        int[] arr = new int[2];
        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
            if(sum1-aliceSizes[i]+bobSizes[j]==sum2+aliceSizes[i]-bobSizes[j]){
                arr[0]=aliceSizes[i];
                arr[1]=bobSizes[j];
                return arr;
            }
            }
        }

    return arr;
    }
}
