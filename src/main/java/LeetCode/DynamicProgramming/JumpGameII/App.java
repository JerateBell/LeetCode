package LeetCode.DynamicProgramming.JumpGameII;

public class App {
    public int jump(int[] nums) {
        int count = 0;
        int maxRange = 0;
        int indexToReachMaxRange = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxRange = Math.max(maxRange, i + nums[i]);

            if(i == indexToReachMaxRange){
                count++;
                indexToReachMaxRange = maxRange;
            }
        }
        return count;
    }
}
