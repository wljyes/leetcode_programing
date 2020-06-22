package linkedList;

public class ReverseBetween {
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        for (int i = 0; i < m - 1; i++) {
            slow = slow.next;
        }

        ListNode fast = slow;
        for (int i = m - 1; i < n; i++) {
            fast = fast.next;
        }

        while (slow.next != fast) {
            ListNode node = slow.next;
            slow.next = slow.next.next;
            node.next = fast.next;
            fast.next = node;
        }

        return dummy.next;
    }
}