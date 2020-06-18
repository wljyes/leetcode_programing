package linkedList;

public class RemoveReciprocalNum {
    
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        one.next = two;
        ListNode head = new RemoveReciprocalNum().removeNthFromEnd(one, 2);
        System.out.println(head.val);
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        int length = 0;
        ListNode cursor = dummyNode;
        //一次扫描计算链表长度
        while (cursor != null) {
            cursor = cursor.next;
            length++;
        }
        //计算倒数的正数位置
        int index = length - n;
        cursor = dummyNode;        
        //移动到要删除的元素前面一个位置
        for (int i = 0; i < index - 1; i++) {
            cursor = cursor.next;
        }
        cursor.next = cursor.next.next;
        cursor.next.next = null;
        return dummyNode.next;
    }
}

