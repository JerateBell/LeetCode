package LeetCode.LinkedList.RemoveLinkedListElements;

public class App {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (head != null) {
            if (head.val != val) {
                curr.next = new ListNode(head.val);
                curr = curr.next;
            }

            head = head.next;
        }

        return dummy.next;
    }
}
