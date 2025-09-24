package LeetCode.Map_Set.FindtheDifferenceofTwoArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for(int i = 0; i < nums1.length; i++){
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }

        for(int i = 0; i < nums2.length; i++){
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
        }

        for(int k : map1.keySet()){
            if(!map2.containsKey(k)){
                list1.add(k);
            }
        }

        for(int k : map2.keySet()){
            if(!map1.containsKey(k)){
                list2.add(k);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        return list;
    }
}
