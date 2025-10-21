package LeetCode.HashTable.WordPattern;

public class App {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");

        if(arr.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String s2 = arr[i];

            if(map.containsKey(c) && !map.get(c).equals(s2)) return false;
            if(!map.containsKey(c) && map.containsValue(s2)) return false;

            map.put(c, s2);
        }

        return true;
    }
}
