class Solution {
    public String sortSentence(String s) {
        String[] arr= new String[9];
        String[] ar=s.split(" ");
        StringBuilder sb=new StringBuilder();
        int i=1;
         while(i<ar.length+1){   
            for(String str:ar){   
                if(str.contains(i+"")){
                    sb.append(str);
                    
                }
            }
            i++;}
        String se=sb.toString();
        for(int j=1;j<ar.length+1;j++){
            se=se.replace(j+""," ");
        }
    return se.trim();
    }
}
