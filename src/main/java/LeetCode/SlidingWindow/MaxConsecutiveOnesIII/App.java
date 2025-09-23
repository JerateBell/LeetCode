package LeetCode.SlidingWindow.MaxConsecutiveOnesIII;

public class App {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int res = 0;
        while (j < nums.length) {
            if(nums[j] == 0){
                count++;
            }
            if(count > k){
                count--;
                while(nums[i] != 0){
                    i++;
                }
                i++;
            }
            res = Math.max(res, j - i + 1);
            j++;        }
        return res;
    }

}
