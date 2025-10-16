package LeetCode.String.ValidPalindrome;

public class App {
    public boolean isPalindrome(String s) {
        String regex = "[^a-zA-Z0-9]";
        s = s.replaceAll(regex, "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }
}
