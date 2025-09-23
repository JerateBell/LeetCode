package LeetCode.String.ReverseVowelsofaString345;

import java.util.Arrays;
import java.util.List;

public class ReverseVowelsofaString345 {
    public static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }
    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();

        while (i < j) {
            while (i < j && !isVowels(arr[i])) i++;
            while (i < j && !isVowels(arr[j])) j--;
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public static boolean isVowels(Character c) {
        c= Character.toLowerCase(c);
        return VOWELS.contains(c);
    }
}
