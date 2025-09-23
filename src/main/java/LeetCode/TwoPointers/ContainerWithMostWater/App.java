package LeetCode.TwoPointers.ContainerWithMostWater;

public class App {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int res = 0;
        while(i<j){
            res = Math.max(res, (j-i) * Math.min(height[i], height[j]));
            if(height[j] > height[i])i++;
            else j--;
        }
        return res;
    }
}
