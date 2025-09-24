package LeetCode.Map_Set.UniqueNumberofOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) +1);

        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            set.add(entry.getValue());
        }
        return set.size() == map.size();



    }
}
