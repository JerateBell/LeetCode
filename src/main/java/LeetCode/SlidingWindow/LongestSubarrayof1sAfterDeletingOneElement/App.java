package LeetCode.SlidingWindow.LongestSubarrayof1sAfterDeletingOneElement;

public class App {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int count = 0;
        int res = 0;
        while (j < nums.length) {
            if(nums[j] == 0) {
                count++;
            }
            while(count > 1){
                if(nums[i] == 0){
                    count--;
                }
                i++;
            }
            res = Math.max(res, j - i);
            j++;
        }
        return res;
    }
}
