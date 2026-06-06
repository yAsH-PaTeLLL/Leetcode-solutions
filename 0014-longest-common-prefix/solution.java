class Solution {
    public String longestCommonPrefix(String[] strs) {
       
       String str=""+strs[0];
       if(strs.length==0){
        return str;
       }
       else if(strs.length==1){
        return strs[0];
       }      
       int k=0;
       int m=2;
       for(int l=1;l<strs.length;l++){
            k=0;
            if(strs[l].length()==0){
                return "";
            }
            while(k<str.length() && k<strs[l].length()){
                if(strs[l].charAt(k)==(str.charAt(k))){
                    k++;
                }
                else {
                    break;
                }
       }
      if(k!=str.length()){
                    str=str.substring(0,k);
                    
                }
       }
     return str;
     }
}
