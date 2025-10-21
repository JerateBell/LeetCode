package LeetCode.Sorting.IntersectionOfTwoArraysII;

public class App {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        if(len1 > len2) return intersect(nums2,nums1);

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < len1; i++) map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);

        for (int i = 0; i < len2; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                ans.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
