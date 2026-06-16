class Solution {
    public void reverseString(char[] s) {
         int left=0;
         int right=s.length-1;
         reverse(s,left,right);
    }
    static char[] reverse(char[] s,int left ,int right){
        if(left>=right){
            return s;
        }
        if(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
        }
        return reverse(s,left+1,right-1);
    }
}
