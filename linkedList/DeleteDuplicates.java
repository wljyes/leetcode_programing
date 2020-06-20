package linkedList;

public class DeleteDuplicates {
    
    public ListNode deleteDuplicates(ListNode head) {
        //哑节点
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode first = dummy;
        ListNode second;
        while (first.next != null) {
            boolean flag = false;

            second = first.next;
            while (second.next != null) {
                if (second.next.val == first.next.val) {
                    second.next = second.next.next;                    
                    flag = true;
                } else {
                    second = second.next;
                }
            }
            if (flag == true) {
                first.next = first.next.next;
            } else {
                first = first.next;
            }
        }
        return dummy.next;
    }
}