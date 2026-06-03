class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int count=0;
        char[] nami=name.toCharArray();
        char[] type=typed.toCharArray();
            int i=0;
            int j=0;
     while( j<type.length){
            if(i<nami.length && nami[i]==type[j]){
                count++;
                i++;
                j++;
            }
           else if(j > 0 && typed.charAt(j) == typed.charAt(j-1)){
                j++;
            }
            else{
                return false;
            }
     }
     if(count!=name.length()){
        return false;
     }
     else{
        return true;
     }
    
    }
}
