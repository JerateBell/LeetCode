package LeetCode.LinkedList.SwapNodesInPairs;

public class App {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode dummy = new ListNode();
        dummy.next = head;

        while (head.next != null) {
            int val = head.val;
            head.val = head.next.val;
            head = head.next;
            head.val = val;

            if(head.next != null) head = head.next;
        }

        return dummy.next;
    }
}
