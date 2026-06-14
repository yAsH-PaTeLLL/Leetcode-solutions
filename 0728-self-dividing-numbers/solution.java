class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
     List<Integer> list =new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(self(i,i)){
                list.add(i);
            }
        }
    return list;
    }
    static boolean self(int n,int m){
        if(n==0){
            return true;
        }
        if((n%10 == 0) && n!=0){
            return false;
            
        }
        if((m%(n%10)) != 0){
            return false;
        }
        return self((n/10),m);
            }
}
