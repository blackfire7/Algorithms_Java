package linkedList;

public class PartitionList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(4);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(2);
        Node<Integer> n4 = new Node<>(5);
        Node<Integer> n5 = new Node<>(2);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        head = partition(head, 3);

        Basic.printLinkedList(head);
    }

    public static Node partition(Node A, int B) {
        if (A == null || A.next == null) return A;
        Node sHead = new Node(-1);
        Node lHead = new Node(-1);

        Node sTail = sHead;
        Node lTail = lHead;
        Node cur = A;

        while (cur != null) {
            if ((int)cur.value < B) {
                sTail.next = cur;
                sTail = cur;
            } else {
                lTail.next = cur;
                lTail = cur;
            }

            cur = cur.next;
        }

        sTail.next = lHead.next;
        lTail.next = null;
        return sHead.next;
    }
}
