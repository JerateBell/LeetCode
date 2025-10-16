package LeetCode.LinkedList.PalindromeLinkedList;

public class App {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int i = 0;
        int j = list.size() - 1;

        while (i < j && list.get(i) == list.get(j)) {
            i++;
            j--;
        }

        return i >= j;
    }
}
