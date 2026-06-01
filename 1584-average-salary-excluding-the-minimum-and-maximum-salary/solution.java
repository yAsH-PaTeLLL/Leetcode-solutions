class Solution {
    public double average(int[] salary) {
        int min=0;
         int max=100001;
        for(int i=0;i<salary.length;i++){
            if(salary[i]<max){
                max=salary[i];
            }
        }
       
        for(int i=0;i<salary.length;i++){
            if(salary[i]>min){
                min=salary[i];
            }
        }
        int sum=0;
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
        }
        return (double)(sum-max-min)/(salary.length-2);    
    }
}
