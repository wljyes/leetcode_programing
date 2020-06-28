package linkedList;

public class ReverseBetween {
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        //慢指针移动到要交换的第一个节点之前
        for (int i = 0; i < m - 1; i++) {
            slow = slow.next;
        }
        //快指针指向第一个要交换的节点
        ListNode fast = slow.next;
        //将第一个要交换的节点之后的 n - m - 1 个节点换到 slow 之后
        for (int i = m; i < n; i++) {
            ListNode node = fast.next;
            fast.next = fast.next.next;
            node.next = slow.next;
            slow.next = node;
        }

        return dummy.next;
    }
}