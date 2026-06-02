class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String k="";
                String l="";
        for(String str:word1){
            k=k+str;
        }
    for(String str:word2){
        l=l+str;
    }
    if(l.equals(k)){
        return true;
    }
    return false;}
}
