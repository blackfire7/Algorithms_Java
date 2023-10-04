package stack;

public class StackImplementation {
    public static void main(String[] args) {
//        StackUsingArray stack = new StackUsingArray(4);
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.printStack();
        System.out.println(stack.pop());
        stack.printStack();
    }
}
