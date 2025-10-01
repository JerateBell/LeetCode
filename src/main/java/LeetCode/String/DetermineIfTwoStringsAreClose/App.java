package LeetCode.String.DetermineIfTwoStringsAreClose;

import java.util.Arrays;

public class App {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = countFreq(word1);
        int[] freq2 = countFreq(word2);

        for(int i = 0; i < 26; i++) {
            boolean appearInFirst = freq1[i] > 0;
            boolean appearInSecond = freq2[i] > 0;

            if (appearInFirst != appearInSecond) {
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }

    private static int[] countFreq(String s){
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) freq[ch - 'a']++;

        return freq;
    }
}
