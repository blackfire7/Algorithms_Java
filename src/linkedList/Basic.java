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

        head = insertInLinkedLIst(3, 55, head);

        printLinkedList(head);
    }

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> insertInLinkedLIst(int position, int data, Node<Integer> head) {
        Node<Integer> temp = head;
        Node<Integer> newNode = new Node<>(data);

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;

    }

}
