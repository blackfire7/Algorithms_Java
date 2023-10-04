package stack;

public class StackUsingArray {
    private int size;
    private int[] a;
    private int top;

    StackUsingArray(int size) {
        this.size = size;
        a = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == size - 1;
    }

    public boolean push(int data) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return false;
        }
        top++;
        a[top] = data;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        return a[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        return a[top];
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
