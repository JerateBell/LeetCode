package LeetCode.LinkedList.RemoveDuplicatesFromSortedListII;

public class App {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode fast = head;
        ListNode slow = dummy;
        slow.next = fast;

        while(fast != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                fast = fast.next;
            }

            if (slow.next != fast) {
                slow.next = fast.next;
                fast = fast.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }

        return dummy.next;
    }
}
