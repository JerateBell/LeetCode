package LeetCode.TwoPointers.MinimumSizeSubarraySum;

public class App {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int i = 0;
        int curSum = 0;

        for (int j = 0; j < nums.length; j++) {
            curSum += nums[j];

            while (curSum >= target) {
                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                }
                curSum -= nums[i];
                i++;
            }
        }

        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
}
