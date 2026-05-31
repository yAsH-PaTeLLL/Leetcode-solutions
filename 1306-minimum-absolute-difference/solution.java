class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min=Math.min(min,(arr[i]-arr[i-1]));
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int j=1;j<arr.length;j++){
            if((arr[j]-arr[j-1])==min){
                list.add(Arrays.asList(arr[j-1],arr[j]));
            }
        }
    return list;}
}
