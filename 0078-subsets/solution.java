class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       ArrayList<Integer> p =new ArrayList<>();
        return sub(p,nums);
    }
    static List<List<Integer>> sub(ArrayList<Integer> p ,int[] up){
        if(up.length==0){
            List<List<Integer>> list=new ArrayList<>();
            list.add( new ArrayList<>(p));
            return list;
        }
        p.add(up[0]);
        List<List<Integer>> list1=sub( p ,Arrays.copyOfRange(up,1,up.length));
        p.remove(p.size()-1);
        List<List<Integer>> list2=sub( p ,Arrays.copyOfRange(up,1,up.length)); 
        list1.addAll(list2);
    return list1;
    }
}
