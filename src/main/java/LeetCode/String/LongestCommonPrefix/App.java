package LeetCode.String.LongestCommonPrefix;

public class App {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].equals("")) return "";
        if(strs.length == 1) return strs[0];

        int lastCharacter = strs[0].length();
        String s;
        boolean flag = false;

        for (int i = 1; i < strs.length; i++) {
            s = strs[i];
            int count = 0;

            while (count < s.length() && count < lastCharacter && s.charAt(count) == strs[i - 1].charAt(count)) {
                count++;
                flag = true;
            }

            lastCharacter = count;
        }

        if(flag) return strs[0].substring(0,lastCharacter);

        return "";
    }
}
