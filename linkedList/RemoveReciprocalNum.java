package linkedList;

public class RemoveReciprocalNum {
    


    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode cursor = head;
        //一次扫描计算链表长度
        while (cursor != null) {
            cursor = cursor.next;
            length++;
        }
        //计算倒数的正数位置
        int index = length - n;
        cursor = head;        
        //移动到要删除的元素前面一个位置
        for (int i = 0; i < index - 1; i++) {
            cursor = cursor.next;
        }
        //考虑要删除的是头节点
        if (index == 0)
            head = head.next;
        else 
            cursor.next = cursor.next.next;
        return head;
    }
}

