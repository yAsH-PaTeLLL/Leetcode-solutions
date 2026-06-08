class Solution {
    public int romanToInt(String s) {
        int[] arr=new int[27];
        
        arr['I'-'A']=1;
        arr['V'-'A']=5;
        arr['X'-'A']=10;
        arr['L'-'A']=50;
        arr['C'-'A']=100;
        arr['D'-'A']=500;
        arr['M'-'A']=1000;
        int lidx=s.charAt(s.length()-1);
        int sidx=s.charAt(0);
        int sum=0;
         for(int i=0;i<s.length();i++){
            if(i+1<s.length() && arr[s.charAt(i)-'A']<arr[s.charAt(i+1)-'A']){
                sum-=arr[s.charAt(i)-'A'];
            }
            else{
                sum+=arr[s.charAt(i)-'A'];
            }
         }
       
    return sum;
    }
}
