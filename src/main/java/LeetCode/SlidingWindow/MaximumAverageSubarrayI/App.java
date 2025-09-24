package LeetCode.SlidingWindow.MaximumAverageSubarrayI;

public class App {
    public double findMaxAverage(int[] nums, int k) {
        double res = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j < nums.length){
            sum += nums[j];
            if(j - i + 1 < k)   j++;
            else{
                double avg = (double)sum / k;
                res = Math.max(res, avg);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return res;
    }
}
