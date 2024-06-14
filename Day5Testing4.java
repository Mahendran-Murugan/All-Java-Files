class Queue {
    int queue[];
    int front, rear;

    Queue(int len) {
        queue = new int[len];
        front = rear = 0;
    }

    public boolean isEmpty() {
        return (front == rear);
    }

    public boolean isFull() {
        return queue.length == rear;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            queue[rear++] = data;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < queue.length)
                queue[rear] = 0;
            rear--;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Peek is: " + queue[front]);
        }
    }
}

public class Day5Testing4 {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enQueue(10);
        q.enQueue(20);
        q.deQueue();
        q.deQueue();
        q.peek();
    }
}

// Queue FIFO
// op: Enquque Dequque
// pointer: front rear
// 6
// 2 3 4 5 6 6
// 0 1 2 3 4 5