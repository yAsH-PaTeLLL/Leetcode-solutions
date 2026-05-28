class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=1;
        int n=0;
        if(arr[arr.length-1]==arr.length){
            return arr.length+k;
        }
        while(n<k){
            if(i<arr.length && arr[i]==j){ 
                j++;
                i++;
            }
            else{
                list.add(j);
                j++;   
                n++; 
            }
            

        }
     return list.get(k-1);
    }
}
