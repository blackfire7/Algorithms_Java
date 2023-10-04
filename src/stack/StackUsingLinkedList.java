package stack;

class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class StackUsingLinkedList {
     Node head;

     boolean isEmpty() {
         return head == null;
     }

     void push(int data) {
         Node newNode = new Node(data);
         newNode.next = head;
         head = newNode;
     }

     int pop() {
         if (isEmpty()) {
             System.out.println("Stack is empty!");
             return -1;
         }

         int temp = head.value;
         head = head.next;
         return temp;
     }

     int peek() {
         if (isEmpty()) {
             System.out.println("Stack is empty!");
             return -1;
         }

         return head.value;
     }

     void printStack() {
         Node tempHead = head;
         while (tempHead != null) {
             System.out.print(tempHead.value + "->");
             tempHead = tempHead.next;
         }
         System.out.println();
     }

}
