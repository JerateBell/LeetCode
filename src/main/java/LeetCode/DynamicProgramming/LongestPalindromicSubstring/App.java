package LeetCode.DynamicProgramming.LongestPalindromicSubstring;

public class App {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0;
        int maxLen = 1;

        for(int i = 0; i < s.length(); i++){
            dp[i][i] = true;
        }

        for(int i = 0; i < s.length() - 1 ; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                if(maxLen == 1) {
                    start = i;
                    maxLen = 2;
                }
            }
        }

        for(int len = 3; len <= s.length(); len++){
            for(int i = 0; i < s.length() - len + 1; i++){
                int j = i + len - 1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    if(j - i + 1 > maxLen){
                        start = i;
                        maxLen = j - i + 1;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
