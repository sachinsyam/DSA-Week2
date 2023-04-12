package Queue;

public class CustomQueue {
    private int size;
    private int[] queueArray;
    private int front;
    private int rear;
    private int count;

    public CustomQueue(int size) {
        this.size = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue element");
            return;
        }

        rear = (rear + 1) % size;
        queueArray[rear] = element;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue element");
            return -1;
        }

        int dequeuedElement = queueArray[front];
        front = (front + 1) % size;
        count--;
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot peek element");
            return -1;
        }

        return queueArray[front];
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == size);
    }

    public int size() {
        return count;
    }
}

