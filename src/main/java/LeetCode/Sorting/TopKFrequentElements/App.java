package LeetCode.Sorting.TopKFrequentElements;

public class App {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        List<Integer> res = new ArrayList<>();

        while (res.size() < k && !maxHeap.isEmpty()) {
            res.add(maxHeap.poll().getKey());
        }

        int[] result = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
