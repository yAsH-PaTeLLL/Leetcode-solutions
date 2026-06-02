class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indices.length; i++){
            sb.append(s.charAt(i));
        }
      
            for (int i = 0; i < indices.length; i++) {
                int j=indices[i];
                    sb.setCharAt(j,s.charAt(i));
                    
                
        }

        return sb.toString();
    }
}
