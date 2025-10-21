package LeetCode.Sorting.MergeSortedArray;

public class App {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[m];

        for (int a = 0; a < m; a++) arr[a] = nums1[a];

        while (i < m  && j < n) {
            if (arr[i] <= nums2[j]) {
                nums1[k] = arr[i];
                i++;
            }
            else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m) nums1[k++] = arr[i++];
        while(j < n) nums1[k++] = nums2[j++];
    }
}
