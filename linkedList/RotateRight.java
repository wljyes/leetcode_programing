package linkedList;

public class RotateRight {
    
    //闭环求解
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) 
            return head;

        //移动到节点尾部
        int length = 0;
        ListNode cursor = head;
        //到最后一个
        while (cursor.next != null) {
            length++;
            cursor = cursor.next;
        }
        length++;
        //形成闭环
        cursor.next = head;
        
        k = k % length;
        //head向后移动k次相当于向前移动length - k次
        k = length - k;
        //head前面的一个，用于最后断开闭环，最开始在最后，移动零次直接断开
        ListNode first = cursor;
        //移动的head
        ListNode second = head;
        for (int i = 0; i < k; i++) {
            first = first.next;
            second = second.next;
        }
        //断开连接
        first.next = null;
        return second;
    }
}