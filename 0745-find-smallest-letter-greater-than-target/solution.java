class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      char ch=ceiling(letters,target);
      return ch;
    }

    static char ceiling(char[] letters,int target){
        if(target>=letters[letters.length - 1]){
            return letters[0];
        }
        int start=0;
        int end=letters.length  -1;
        
        while(start<=end){
            int mid=start + end-start/2;
            if(target>letters[mid]){
                start=mid+1;
            }
            else if(target<letters[mid]){
                end=mid-1;
            }
            else{
                return letters[mid+1];
            }  
         }
            return letters[start];
    }

}
