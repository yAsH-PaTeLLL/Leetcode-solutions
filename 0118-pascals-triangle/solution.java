class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        int ans=1;
        
        for(int i=1;i<=numRows;i++){
              ArrayList<Integer> temp=new ArrayList<>();  
                temp.add(1);
               ans=1;
                for(int j=1;j<i;j++){
                    ans=ans*(i-j);
                    ans=ans/j;
                    temp.add(ans);
                }
                list.add(temp);
        }


    return list;
    }
}
