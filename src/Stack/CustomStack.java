package Stack;

public class CustomStack {
    private int size;
    private int[] stackArray;
    private int top;

    public CustomStack(int size) {
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full, cannot push element");
            return;
        }

        top++;
        stackArray[top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop element");
            return -1;
        }

        int poppedElement = stackArray[top];
        top--;
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot peek element");
            return -1;
        }

        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}
