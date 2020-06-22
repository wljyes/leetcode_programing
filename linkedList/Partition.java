package linkedList;

public class Partition {
    
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        //锚点
        ListNode anchor = dummy;        
        //固定锚点到第一个大于等于 x 的节点之前
        while (anchor.next != null && anchor.next.val < x) {
            anchor = anchor.next;
        }       
        
        //finder去把后面的小于 x 的节点找出来出入到到锚点后面        
        ListNode finder = anchor;
        while (finder.next != null) {
            if (finder.next.val < x) {
                ListNode node = finder.next; //保存要换位置的节点引用
                finder.next = finder.next.next; //在原来的位置删去
                //插入到锚点后面
                node.next = anchor.next;
                anchor.next = node;
                //锚点更新为新插入的节点，以保持顺序
                anchor = anchor.next;
            } else {
                finder = finder.next;
            }
        }
        return dummy.next;
    }
}