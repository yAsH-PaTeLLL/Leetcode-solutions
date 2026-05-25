class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int m=0;
        if(n==1){
            arr[0]=0;
            return arr;
        }
        if(n%2!=0){
            arr[(n-1)/2]=0;
            m=(n-1)/2;
            for(int i=0;i<m;i++){
                arr[((n-1)/2)+i]=i+1;
                arr[((n-1)/2)-i-1]=-1-i;
            }
        }
        else{
            m=n/2;
            for(int i=0;i<m;i++){
                arr[(n/2)+i]=i+1;
                arr[((n/2))-i-1]=-i-1;
        }}
    return arr;
    }
}
