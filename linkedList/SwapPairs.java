package linkedList;

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

    //两两交换递归
    public ListNode swapPairsRecusive(ListNode head) {
        //递归出口
        if (head == null || head.next == null) 
            return head;
        
        //交换这两个节点后面的两个节点，并拿到返回的头节点
        ListNode node = swapPairsRecusive(head.next.next);
        //交换后的头节点实际上是原来的第二个节点
        ListNode second = head.next;

        //交换当前两节点，并连上后面的节点
        head.next.next = head;
        head.next = node;

        //返回交换后的头节点
        return second;
    }
}