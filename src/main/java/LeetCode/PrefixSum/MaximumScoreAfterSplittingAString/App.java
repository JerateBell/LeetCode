package LeetCode.PrefixSum.MaximumScoreAfterSplittingAString;

public class App {
    public int maxScore(String s) {
        int[] prefix = new int[s.length()];
        int[] suffix = new int[s.length()];
        int maxVal = Integer.MIN_VALUE;

        prefix[0] = 1 - (s.charAt(0) - '0');
        suffix[s.length()-1] = s.charAt(s.length() - 1) - '0';

        for(int i = 1; i < s.length(); i++){
            prefix[i] = prefix[i - 1] + 1 - (s.charAt(i) - '0');
        }

        for(int i = s.length() - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] + s.charAt(i) - '0';
        }

        for(int i = 0 ; i < s.length() - 1; i++){
            maxVal = Math.max(maxVal, prefix[i] + suffix[i+1]);
        }

        return maxVal ;
    }
}
