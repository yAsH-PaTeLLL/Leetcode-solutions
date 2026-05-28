class Solution {
    public boolean isPerfectSquare(int num) {
        long start=0;
        long end=num;
        while(start<=end){
            long mid=start+(end-start)/2;
            if (num>(int)mid*mid){
                    start=mid+1;
            }
            else if(num<(int)mid*mid){
                end=mid-1;
            }
            else{
                return true;
            }
            }

    return false;
    }
}
