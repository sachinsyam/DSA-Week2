package Queue;

public class CustomCircularQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int count;
    private int size;

    public CustomCircularQueue(int size) {
        this.size = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
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
}
