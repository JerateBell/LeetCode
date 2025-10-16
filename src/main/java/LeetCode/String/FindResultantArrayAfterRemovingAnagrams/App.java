package LeetCode.String.FindResultantArrayAfterRemovingAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        String prevStr = "";

        for (String w : words) {
            char[] arr = w.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);

            if (!str.equals(prevStr)) {
                result.add(w);
                prevStr = str;
            }
        }

        return result;
    }
}
