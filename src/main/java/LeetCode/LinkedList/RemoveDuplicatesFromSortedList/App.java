package LeetCode.LinkedList.RemoveDuplicatesFromSortedList;

public class App {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;

        ListNode dummy = new ListNode(-101);
        ListNode curr = dummy;
        int prev = head.val - 1;

        while(head != null){
            if(head.val != prev){
                curr.next = new ListNode(head.val);
                curr = curr.next;
                prev = head.val;
            }
            head = head.next;
        }

        return dummy.next;
    }
}
