class Solution {
    public int largestAltitude(int[] gain) {
       int[] altitude=new int[gain.length+1];
       altitude[0]=0;
       for(int i=1;i<altitude.length;i++){
                    altitude[i]=gain[i-1]+altitude[i-1];
       }
       int ans= peak(altitude);
       return ans; 
    }

    static int peak(int[] gain ){
                int max=Integer.MIN_VALUE;
                for(int i=0;i<gain.length;i++){
                    if(gain[i]>max){
                        max=gain[i];
                    }
                }
    return max;
    }
}
