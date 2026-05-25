class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr=new int[101];
        for(int[] log:logs){
            int birth=log[0];
            int death=log[1];
            arr[birth-1950]++;
            arr[death-1950]--;
        }
        int currentPopulation = 0;
        int maxPopulation = 0;
        int answerYear = 1950;
        for (int i = 0; i < 101; i++) {
            currentPopulation += arr[i];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                answerYear = i + 1950;
            }
        }

    return answerYear;}
}
