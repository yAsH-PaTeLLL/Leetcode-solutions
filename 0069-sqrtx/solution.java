class Solution {
    public int mySqrt(int x) {
       
        long start=1;
        long end=2;
        while(start<end && x>=(end*end)){
                long temp=start;
                start=end;
                end=end+(end-temp+1)*2;
            
        }
        while(end>=start){
        long mid=start+((end-start)/2);
        if(x==mid*mid){
                return (int) mid;
        }
        else if(x>mid*mid){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        
        }
            
            
        
    return (int) end;}
}
