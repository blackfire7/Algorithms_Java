package linkedList;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(-1);
        Node<Integer> n1 = new Node<>(-1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(2);
        Node<Integer> n4 = new Node<>(3);

        head.next = n1;
        n1.prev = head;

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        removeDuplicate(head);

        Basic.printLinkedList(head);
    }

    public static Node removeDuplicate(Node head) {
        Node orig = head;
        Node newHead = null;
        Node temp = head;

        while (orig != null) {
            while (orig.next != null && orig.value == orig.next.value) {
                orig = orig.next;
            }

            if (newHead == null) {
                newHead = orig;
            } else {
                temp.next = orig;
                temp = orig;
            }

            orig = orig.next;
        }

        return newHead;
    }

}
