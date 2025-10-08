package LeetCode.PrefixSum.RangeSumQueryImmutable;

public class App {
    class NumArray {
        private int[] prefix = new int[10000];

        public NumArray (int[] nums) {
            prefix[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefix[i] = prefix[i-1] + nums[i];
            }
        }

        public int sumRange (int left, int right) {
            if(left == 0) return prefix[right];

            return prefix[right] - prefix[left-1];
        }
    }
}
