package LeetCode.DynamicProgramming.HouseRobber;

public class App {
    //Solution 1
    public int robFirstAttempt(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        if(nums.length == 3) return Math.max(nums[1], nums[0] + nums[2]);
        nums[2] = Math.max(nums[0] + nums[2], nums[1]);
        for(int i = 3; i < nums.length; i++){
            nums[i] = Math.max(Math.max(nums[i] + nums[i-2], nums[i-3] + nums[i]), nums[i-1]);
        }
        return nums[nums.length-1];
    }

    //Optimization
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        nums[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            nums[i] = Math.max(nums[i-1] , nums[i-2] + nums[i]);
        }
        return nums[nums.length-1];
    }
}
