class Solution {
    public boolean halvesAreAlike(String s) {
        String vowel="aeiou";
        s=s.toLowerCase();
        int count=0;
        int count2=0;
        char[] neww=s.toCharArray();
        for(int i=0;i<neww.length/2;i++){
            if(vowel.contains(String.valueOf(neww[i]))){
                count++;
            }
        }
        for(int i=(neww.length/2);i<neww.length;i++){
            if(vowel.contains(String.valueOf(neww[i]))){
                count2++;
            }
        }
        if(count==count2){
            return true;
        }
    return false;}
}
