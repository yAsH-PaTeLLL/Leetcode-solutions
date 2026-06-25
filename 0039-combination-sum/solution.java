class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list1=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        return comb(list1,list,candidates,target,0);
    }
    static List<List<Integer>> comb(List<List<Integer>> list1,ArrayList<Integer> list,int[]  arr,int target,int index){
        if(sum(list)>target){
            return list1;
        }
        if(sum(list)==target){
            list1.add(new ArrayList<>(list));
            return list1;
        }

        for(int i=index;i<arr.length;i++){
            list.add(arr[i]);
            comb(list1,list,arr,target,i);
            list.remove(list.size()-1);
        }
        return list1;
    }
    static int sum(ArrayList<Integer> list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
