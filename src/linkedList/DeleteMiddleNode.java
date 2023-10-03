package linkedList;

class ListNode<E> {
    E val;
    ListNode<E> next;
    ListNode<E> prev;

    ListNode() {
        next = null;
        prev = null;
    }

    ListNode(E value) {
        this.val = value;
        this.next = null;
        this.prev = null;
    }

    ListNode(E val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class DeleteMiddleNode {

    public static void main(String[] args) {
        ListNode head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head = deleteMiddle(head);

        printLinkedList(head);
    }

    public static void printLinkedList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        int count = countNodes(head);
        ListNode originalHead = head;
        int mid = count / 2;

        while (mid-- > 1) {
            head = head.next;
        }

        head.next = head.next.next;

        return originalHead;
    }

    public static int countNodes(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while(temp != null) {
            temp = temp.next;
            count ++;
        }

        return count;
    }

    static ListNode newNode(int data) {
        ListNode temp = new ListNode();
        temp.val = data;
        temp.next = null;
        return temp;
    }

}
