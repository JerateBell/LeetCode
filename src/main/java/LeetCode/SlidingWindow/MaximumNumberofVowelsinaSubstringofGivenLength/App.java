package LeetCode.SlidingWindow.MaximumNumberofVowelsinaSubstringofGivenLength;

import java.util.Arrays;
import java.util.List;

public class App {
    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int res = 0;

        while(j < s.length()) {
            if(VOWELS.contains(s.charAt(j))) count++;
            if(j - i + 1 < k) {
                j++;
            }else{
                res = Math.max(res, count);
                if(VOWELS.contains(s.charAt(i))) count--;
                i++;
                j++;

            }
        }
        return res;
    }
}
