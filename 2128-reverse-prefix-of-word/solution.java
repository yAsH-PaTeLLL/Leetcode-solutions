class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(""+ch)){
            return word;
        }
        String s="";
        int idx = word.indexOf(ch);
        for(int i=idx;i>=0;i--){
            s+=word.charAt(i);

        }
        for(int i=idx+1;i<word.length();i++){
            s+=word.charAt(i);
            
        }
    return s;
    }
}
