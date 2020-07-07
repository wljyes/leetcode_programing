package linkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    static class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {

    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= length) 
            return -1;
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (length == 0) {
            head = new Node(val, null);
            tail = head;
        } else {
            head = new Node(val, head);
        }
        length++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (length == 0) {
            head = new Node(val, null);
            tail = head;
        } else {
            tail.next = new Node(val, null);
            tail = tail.next;
        }
        length++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
        } else if (index == length) {
            addAtTail(val);
        } else if (index < length) {
            Node p = head;
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            p.next = new Node(val, p.next);
            length++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) 
            return;
        if (index == 0) {
            head = head.next;
            if (length == 1)
                tail = head;
            length--;
            return;
        }
        Node p = head;
        for (int i = 0; i < index - 1; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        if (p.next == null) //删除尾节点，要移动尾指针
            tail = p;
        length--;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        // list.addAtHead(7);
        // list.addAtHead(2);
        // list.addAtHead(1);
        // list.addAtIndex(3, 0);
        // list.deleteAtIndex(2);
        // list.addAtHead(6);
        // list.addAtTail(4);
        // list.addAtHead(0);
        // list.addAtTail(1);
        // list.deleteAtIndex(1);
list.addAtHead(84);
list.addAtTail(2);
list.addAtTail(39);
list.get(3);
list.get(1);
list.addAtTail(42);
list.addAtIndex(1,80);
list.addAtHead(14);
list.addAtHead(1);
list.addAtTail(53);
list.addAtTail(98);
list.addAtTail(19);
list.addAtTail(12);
list.get(2);
list.addAtHead(16);
list.addAtHead(33);
list.addAtIndex(4,17);
list.addAtIndex(6,8);
list.addAtHead(37);
list.addAtTail(43);
list.deleteAtIndex(11);
list.addAtHead(80);
list.addAtHead(31);
list.addAtIndex(13,23);
list.addAtTail(17);
list.get(4);
list.addAtIndex(10,0);
list.addAtTail(21);
list.addAtHead(73);
list.addAtHead(22);
list.addAtIndex(24,37);
list.addAtTail(14);
list.addAtHead(97);
list.addAtHead(8);
list.get(6);
list.deleteAtIndex(17);
list.addAtTail(50);
list.addAtTail(28);
list.addAtHead(76);
list.addAtTail(79);
list.get(18);
list.deleteAtIndex(30);
list.addAtTail(5);
list.addAtHead(9);
list.addAtTail(83);
list.deleteAtIndex(3);
list.addAtTail(40);
list.deleteAtIndex(26);
list.addAtIndex(20,90);
list.deleteAtIndex(30);
list.addAtTail(40);
list.addAtHead(56);
list.addAtIndex(15,23);
list.addAtHead(51);
list.addAtHead(21);
list.get(26);
list.addAtHead(83);
list.get(30);
list.addAtHead(12);
list.deleteAtIndex(8);
list.get(4);
list.addAtHead(20);
list.addAtTail(45);
list.get(10);
list.addAtHead(56);
list.get(18);
list.addAtTail(33);
list.get(2);
list.addAtTail(70);
list.addAtHead(57);
list.addAtIndex(31,24);
list.addAtIndex(16,92);
list.addAtHead(40);
list.addAtHead(23);
list.deleteAtIndex(26);
list.get(1);
list.addAtHead(92);
list.addAtIndex(3,78);
list.addAtTail(42);
list.get(18);
list.addAtIndex(39,9);
list.get(13);
list.addAtIndex(33,17);
list.get(51);
list.addAtIndex(18,95);
list.addAtIndex(18,33);
list.addAtHead(80);
list.addAtHead(21);
list.addAtTail(7);
list.addAtIndex(17,46);
list.get(33);
list.addAtHead(60);
list.addAtTail(26);
list.addAtTail(4);
list.addAtHead(9);
list.get(45);
list.addAtTail(38);
list.addAtHead(95);
list.addAtTail(78);
list.get(54);
list.addAtIndex(42,86);;
        for (int i = 0; i < list.length; i++) {
            System.out.println(list.get(i));
            
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */