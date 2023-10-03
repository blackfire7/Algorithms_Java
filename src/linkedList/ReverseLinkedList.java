package linkedList;

public class ReverseLinkedList {
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

        head = reverseLinkedList(head);

        Basic.printLinkedList(head);
    }

    public static Node reverseLinkedList(Node head) {


        return head;
    }
}
