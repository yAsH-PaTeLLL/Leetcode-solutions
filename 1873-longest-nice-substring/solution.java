class Solution {
    public String longestNiceSubstring(String s) {

    return nice(s);  
    }
    

    
    static String nice(String s){
        for(int i=0;i<s.length();i++){  
            char ch=s.charAt(i);      
                if(Character.isUpperCase(ch)){
                    if(!(s.contains(Character.toLowerCase(ch)+""))){
                    
                        String left= nice(s.substring(i+1));
                        
                        
                        String right= nice(s.substring(0,i));
                        if(left.length()>right.length()){
                            return left;
                        }
                        else{
                            return right;
                        }
                        
                    }
                }
                else{
                    if(!(s.contains(Character.toUpperCase(ch)+""))){
                        
                        String left=  nice(s.substring(i+1));
                        
                        
                        String right= nice(s.substring(0,i));
                        if(left.length()>right.length()){
                            return left;
                        }
                        else{
                            return right;
                        }
                    }
                }
        }
    return s;
    }
}
