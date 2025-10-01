package LeetCode.DynamicProgramming.NthTribonacciNumber;

public class App {
        public int tribonacci(int n) {
            int[] tribonacciNums = new int[38];
            tribonacciNums[0] = 0;
            tribonacciNums[1] = 1;
            tribonacciNums[2] = 1;

            for(int i = 3; i <= 37; i++){
                tribonacciNums[i] = tribonacciNums[i-1] + tribonacciNums[i-2] + tribonacciNums[i-3];
            }
            return tribonacciNums[n];
        }
}
