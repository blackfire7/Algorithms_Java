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
        n1.prev = head;

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        printLinkedList(head);

        head = insertInLinkedLIst(3, 5, head);
        printLinkedList(head);

        head = deleteFromLinkedList(3, head);
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
        Node<Integer> newNode = new Node<>(data);

        if (position == 0) {
            newNode.next = head;
            head.prev = newNode;

            return newNode;
        }

        Node<Integer> temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;

        return head;

    }

    public static Node<Integer> deleteFromLinkedList(int position, Node<Integer> head) {
        if (position == 0) {
            return head.next;
        }

        Node<Integer> temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

}
