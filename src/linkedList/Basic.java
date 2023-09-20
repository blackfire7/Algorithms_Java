package linkedList;

class Node<E> {
    E value;
    Node<E> next;
    Node<E> prev;

    Node(E value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class Basic {

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(2);
        Node<Integer> n1 = new Node<>(4);
        Node<Integer> n2 = new Node<>(1);
        Node<Integer> n3 = new Node<>(7);
        Node<Integer> n4 = new Node<>(3);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printLinkedList(head);
    }

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

}
