class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      int count=words.length;
      for(String str:words){
            for(int i=0;i<str.length();i++){
                if(!allowed.contains(str.charAt(i)+"")){
                    count--;
                    break;
                }
            }
      } 
    return count;
    }
}
