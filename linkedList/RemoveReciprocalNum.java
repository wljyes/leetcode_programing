package linkedList;

public class RemoveReciprocalNum {

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        one.next = two;
        ListNode head = new RemoveReciprocalNum().removeByDoublePointer(one, 2);
        System.out.println(head.val);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        int length = 0;
        ListNode cursor = dummyNode;
        // 一次扫描计算链表长度
        while (cursor != null) {
            cursor = cursor.next;
            length++;
        }
        // 计算倒数的正数位置
        int index = length - n;
        cursor = dummyNode;
        // 移动到要删除的元素前面一个位置
        for (int i = 0; i < index - 1; i++) {
            cursor = cursor.next;
        }
        cursor.next = cursor.next.next;
        cursor.next.next = null;
        return dummyNode.next;
    }

    public ListNode removeByDoublePointer(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        // 两个指针
        ListNode cursor = dummyNode;
        ListNode cursor2 = dummyNode;
        // 计数第一个指针走的步数
        for (int i = 0; i < n; i++) {
            cursor = cursor.next;
        }
        while (cursor.next != null) {
            // 分开两个指针的距离，之后当第一个指针走到最后一个时，第二个指针就在倒数第n个的前面
            cursor = cursor.next;
            cursor2 = cursor2.next;
        }
        // 删除倒数第n个节点，即第二个指针后的节点
        cursor2.next = cursor2.next.next;
        return dummyNode.next;
    }
}
