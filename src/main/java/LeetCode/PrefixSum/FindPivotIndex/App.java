package LeetCode.PrefixSum.FindPivotIndex;

public class App {
    public int pivotIndex(int[] nums) {
        int sumLeft[] = new int[nums.length];
        int sumRight[] = new int[nums.length];

        for(int i = nums.length - 1; i >= 0; i--){
            sumRight[i] = (i == nums.length - 1) ? nums[nums.length - 1] : sumRight[i+1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            sumLeft[i] = (i == 0) ? nums[0] : sumLeft[i-1] + nums[i];
            if(sumRight[i] == sumLeft[i]){
                return i;
            }
        }
        return -1;
    }
}
