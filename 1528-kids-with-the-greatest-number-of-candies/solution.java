import java.util.*;

class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> list = new ArrayList<>();

        int max = candies[0];

        // find maximum
        for(int i = 1; i < candies.length; i++) {

            if(candies[i] > max) {
                max = candies[i];
            }
        }

        // check each kid
        for(int i = 0; i < candies.length; i++) {

            if(candies[i] + extraCandies >= max) {
                list.add(true);
            }
            else {
                list.add(false);
            }
        }

        return list;
    }
}
