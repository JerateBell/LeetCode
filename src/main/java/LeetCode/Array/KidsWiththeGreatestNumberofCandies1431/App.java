package LeetCode.Array.KidsWiththeGreatestNumberofCandies1431;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for(int i = 0; i < candies.length; i++){
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        List<Boolean> result = new ArrayList<Boolean>();
        for(int i : candies){
            result.add(i + extraCandies >= maxCandies);
        }
        return result;
    }
}
