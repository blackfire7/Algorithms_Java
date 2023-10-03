package linkedList;

public class FindMiddleOfLinkedList {
    public static int getMiddle(ListNode head) {
        int count = DeleteMiddleNode.countNodes(head);
        return count / 2;
    }
}
