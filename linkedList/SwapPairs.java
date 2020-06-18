package linkedList;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

public class SwapPairs {
    
    public ListNode swapPairs(ListNode head) {
        ListNode first = head;
        ListNode second = head != null ? head.next : null;
        //哑节点方便交换
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        //两两交换
        while (second != null) {
            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first;
            first = first.next;
            if (first == null) 
                second = null;
            else 
                second = first.next;
        }
        return dummy.next;
    }
}