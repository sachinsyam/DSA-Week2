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

    public void display(){
        if(rear == -1)
            System.out.println("Queue is empty");
        else {
            System.out.println("Size:" + count + "/" + size);
            for (int i = front; i <= rear; i++) {
                System.out.printf(queueArray[i] + " ");
            }
        }
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue element");
            return;
        }

        rear++;
        queueArray[rear] = element;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue element");
            return -1;
        }

        int dequeuedElement = queueArray[front];
        front++;
        count--;
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot peek element");
            return -1;
        }
        System.out.println(queueArray[front]);
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

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("\nFront:"+queue.queueArray[queue.front]);
        System.out.println("Rear:"+queue.queueArray[queue.rear]);

        queue.dequeue();

        queue.display();
        System.out.println("\nFront:"+queue.queueArray[queue.front]);
        System.out.println("Rear:"+queue.queueArray[queue.rear]);
    }
}

