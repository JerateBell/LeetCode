package LeetCode.DynamicProgramming.JumpGameII;

public class App {
    public int jump(int[] nums) {
        int count = 0;
        int maxRange = 0;
        int indexToReachMaxRange = 0;
        int n = nums.length - 1;

        for (int i = 0; i < n; i++) {
            maxRange = Math.max(maxRange, i + nums[i]);

            if(i == indexToReachMaxRange){
                count++;
                indexToReachMaxRange = maxRange;
                if(indexToReachMaxRange >= n) break;
            }
        }
        return count;
    }
}
