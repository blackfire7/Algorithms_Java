package linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        Node<Integer> n5 = new Node<>(6);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

//        head = reverseLinkedList(head);
        head = reverseLinkedListRecursively(head);

        Basic.printLinkedList(head);
    }

    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) return head;

        Node prev = head;
        Node cur = head.next;
        head.next = null;

        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static Node reverseLinkedListRecursively(Node head) {
        if (head == null || head.next == null) return head;

        Node headOfSubProblem = reverseLinkedListRecursively(head.next);

        head.next.next = head;
        head.next = null;

        return headOfSubProblem;
    }

    /**
     * Problem Statement
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     *
     * Example 1:
     * Input:
     *
     * 1 -> 2 -> 3 -> 4 -> 5
     *
     * Output:
     *
     * 5 -> 4 -> 3 -> 2 -> 1
     *
     * Example 2:
     * Input:
     *
     * head = []
     *
     * Output:
     *
     * []
     *
     * Constraints:
     * 0 <= Number of Nodes <= 5000
     * -5000 <= Node.val <= 5000
     * */
}
