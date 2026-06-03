class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber<=26){
            char num=((char)('A'+columnNumber-1));
            return ""+num;
        }
        StringBuilder sb=new StringBuilder();
        if(columnNumber>26){
            while(columnNumber>0){
                columnNumber--;
            sb.append((char)('A'+columnNumber%26 ) );
            columnNumber=columnNumber/26;}
            return sb.reverse().toString();
        }
    return "";
    }
}
