class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s= new StringBuilder();
        int n=0;
        while(columnNumber!=0){
                columnNumber--;
                n=columnNumber%26;
                s.append((char)(n+'A'));
                  columnNumber=columnNumber/26;          
        }
    return s.reverse().toString();
    }
}
