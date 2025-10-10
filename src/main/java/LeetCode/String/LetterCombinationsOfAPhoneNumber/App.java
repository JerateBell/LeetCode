package LeetCode.String.LetterCombinationsOfAPhoneNumber;

import java.util.*;

public class App {
    private List<String> resultList = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        StringBuilder sb = new StringBuilder();
        recurr(sb, 0, digits);

        return resultList;
    }

    private void recurr (StringBuilder sb, int idx, String s) {
        if(s.isEmpty()) return;

        if(idx == s.length()) {
            resultList.add(sb.toString());
            return;
        };

        for(char c : getChars(s.charAt(idx) - '0')){
            recurr(sb.append(c), idx + 1, s);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    private static List<Character> getChars(int n) {
        Map<Integer, List<Character>> map = new HashMap<>();
        map.put(2, Arrays.asList('a', 'b', 'c'));
        map.put(3, Arrays.asList('d', 'e', 'f'));
        map.put(4, Arrays.asList('g', 'h', 'i'));
        map.put(5, Arrays.asList('j', 'k', 'l'));
        map.put(6, Arrays.asList('m', 'n', 'o'));
        map.put(7, Arrays.asList('p', 'q', 'r', 's'));
        map.put(8, Arrays.asList('t', 'u', 'v'));
        map.put(9, Arrays.asList('w', 'x', 'y', 'z'));

        return new ArrayList<>(map.get(n));
    }
}
