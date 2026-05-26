class Solution {
    public int[] plusOne(int[] digits) {
    int i=digits.length;    
    
    while(digits[i-1]==9){
            digits[i-1]=0;
              if(i==1){
        int[] arr=new int[digits.length+1];
        arr[0]=1;
        for( int j=1;j<digits.length+1;j++){
            arr[j]=0;
        }
        
        return arr;
    }
              i--;
            
    }
    digits[i-1]+=1;
    return digits;
    }
}
